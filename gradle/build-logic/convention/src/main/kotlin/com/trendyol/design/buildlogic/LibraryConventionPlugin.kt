package com.trendyol.design.buildlogic

import com.android.build.api.dsl.LibraryExtension
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidExtension

class LibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("io.gitlab.arturbosch.detekt")
                apply("org.jetbrains.kotlin.plugin.compose")
            }

            with(dependencies) {
                add("detektPlugins", libs("detektFormatting"))
                add("detektPlugins", libs("detektComposeRules"))
            }

            configure<LibraryExtension> {
                buildFeatures.compose = true

                testOptions.targetSdk = Configs.TARGET_SDK
                lint.targetSdk = Configs.TARGET_SDK
            }

            configure<KotlinAndroidExtension> {
                explicitApi()
            }

            configureAndroid()
            keepLegacyKotlinModuleNames()
            configureApiValidation()

            configure<DetektExtension> {
                buildUponDefaultConfig = true
                config.from.add("$rootDir/config/detekt/detekt.yml")
                config.from.add("$rootDir/config/detekt/detekt-compose.yml")
            }
        }
    }
}
