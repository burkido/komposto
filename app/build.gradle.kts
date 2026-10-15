import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("komposto.application")
}

android {
    namespace = "com.trendyol.design"

    defaultConfig {
        applicationId = "com.trendyol.design"
    }

    testOptions {
        // Host-side Compose Preview screenshot tests (Layoutlib), sources in src/screenshotTest/kotlin.
        screenshotTests.create("screenshotTest") {
            engineVersion = libs.versions.screenshotEngine.get()
            targetVariants.add("debug")

            dependencies {
                implementation(project.dependencies.platform(libs.androidxComposeBOM))
                implementation(libs.androidxComposeUiTooling)
                implementation(libs.screenshotValidationApi)
            }
        }
    }
}

dependencies {

    implementation(projects.core)
    implementation(projects.bottomsheet)
    implementation(projects.compat)

    implementation(libs.androidxCore)
    implementation(libs.androidxLifecycleRuntime)
    implementation(libs.androidxActivityCompose)
    implementation(libs.androidxAppCompat)
    implementation(libs.androidMaterial)

    implementation(platform(libs.androidxComposeBOM))
    implementation(libs.androidxComposeUiUi)
    implementation(libs.androidxComposeUiGraphics)
    implementation(libs.androidxComposeMaterial)
    implementation(libs.androidxComposeMaterialIconsCore)
    implementation(libs.androidxComposeUiTooling)
    implementation(libs.androidxComposeUiGoogleFonts)

    implementation(libs.showkase)
    ksp(libs.showkaseProcessor)

    androidTestImplementation(platform(libs.androidxComposeBOM))
    androidTestImplementation(libs.androidxComposeUiTestJunit4)
    androidTestImplementation(libs.androidxTestCore)
    androidTestImplementation(libs.androidxTestMonitor)
    androidTestImplementation(libs.androidxTestRunner)
    androidTestImplementation(libs.androidxTestRules)
    debugImplementation(libs.androidxComposeUiTestManifest)
}

// TrendyolTheme reads Locale.getDefault(), so pin the screenshot JVM's locale and time zone to keep
// renders identical across developer machines and CI.
tasks.withType<Test>().matching { it.name.contains("ScreenshotTest") }.configureEach {
    systemProperty("user.language", "en")
    systemProperty("user.country", "US")
    systemProperty("user.timezone", "UTC")
    // Gradle loads every suite class while looking for tests, but PreviewParameterProvider
    // implementations need Compose, which only the renderer's class loader has. The renderer still
    // loads them for the previews that use them.
    exclude("**/*Provider.class")
}

// AGP 9.4.1 gives the screenshot suite the app's classes jar as its Kotlin friend path but compiles it
// against the class directories, so `internal` app declarations are not visible to the suite. Add the
// directory the suite actually sees, as androidTest gets.
tasks.withType<KotlinCompile>().matching { it.name == "compileScreenshotTestHostJarDebugKotlin" }.configureEach {
    friendPaths.from(tasks.named<KotlinCompile>("compileDebugKotlin").flatMap { it.destinationDirectory })
}
