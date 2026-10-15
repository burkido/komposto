package com.trendyol.design.buildlogic

import kotlinx.validation.KotlinApiBuildTask
import kotlinx.validation.KotlinApiCompareTask
import org.gradle.api.Project
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.compile.JavaCompile
import org.gradle.kotlin.dsl.named
import org.gradle.kotlin.dsl.register
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/**
 * binary-compatibility-validator only configures Android modules that apply the
 * `org.jetbrains.kotlin.android` plugin. AGP 9 compiles Kotlin itself (built-in Kotlin), so the
 * validator silently registers nothing. Wire its tasks to the release classes instead, keeping the
 * `apiDump`/`apiCheck` task names and the existing `api/<module>.api` files.
 */
internal fun Project.configureApiValidation() {
    val apiValidator = configurations.dependencyScope("apiValidator")
    val apiValidatorClasspath = configurations.resolvable("apiValidatorClasspath") {
        extendsFrom(apiValidator.get())
    }
    with(dependencies) {
        add(apiValidator.name, "org.ow2.asm:asm:$ASM_VERSION")
        add(apiValidator.name, "org.ow2.asm:asm-tree:$ASM_VERSION")
        add(apiValidator.name, "org.jetbrains.kotlin:kotlin-metadata-jvm:${getVersion("kotlin").requiredVersion}")
    }

    val apiFileName = "${project.name}.api"
    val apiBuild = tasks.register<KotlinApiBuildTask>("apiBuild") {
        runtimeClasspath.from(apiValidatorClasspath)
        inputClassesDirs.from(
            tasks.named<KotlinCompile>("compileReleaseKotlin").flatMap { it.destinationDirectory },
            tasks.named<JavaCompile>("compileReleaseJavaWithJavac").flatMap { it.destinationDirectory },
        )
        outputApiFile.set(layout.buildDirectory.file("api/$apiFileName"))
    }

    val apiCheck = tasks.register<KotlinApiCompareTask>("apiCheck") {
        group = "verification"
        projectApiFile.set(layout.projectDirectory.file("api/$apiFileName"))
        generatedApiFile.set(apiBuild.flatMap { it.outputApiFile })
    }

    tasks.register<Copy>("apiDump") {
        group = "other"
        from(apiBuild.flatMap { it.outputApiFile })
        into(layout.projectDirectory.dir("api"))
    }

    tasks.named("check") { dependsOn(apiCheck) }
}

/**
 * kotlin-android named each Kotlin module `<project>_<variant>` (for example `core_release`), while
 * built-in Kotlin uses just `<project>`. The module name is baked into compiler-mangled members such
 * as the Compose `ComposableSingletons` lambda getters, so keep the old names to leave the published
 * ABI unchanged.
 */
internal fun Project.keepLegacyKotlinModuleNames() {
    tasks.withType(KotlinCompile::class.java).configureEach {
        val variant = MAIN_COMPILE_TASK.matchEntire(name)?.groupValues?.get(1) ?: return@configureEach
        if (TEST_COMPONENT in variant) return@configureEach
        compilerOptions.moduleName.set("${project.name}_${variant.replaceFirstChar(Char::lowercaseChar)}")
    }
}

private const val ASM_VERSION = "9.6"
private val MAIN_COMPILE_TASK = Regex("compile(\\w+)Kotlin")
private val TEST_COMPONENT = Regex("UnitTest|AndroidTest|TestFixtures|ScreenshotTest")
