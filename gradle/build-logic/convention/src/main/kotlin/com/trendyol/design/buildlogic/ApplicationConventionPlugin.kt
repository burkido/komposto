package com.trendyol.design.buildlogic

import com.android.build.api.dsl.ApplicationExtension
import com.google.devtools.ksp.gradle.KspExtension
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class ApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(pluginId("androidApplication"))
                apply(pluginId("composeCompiler"))
                apply(pluginId("detekt"))
                apply(pluginId("ksp"))
            }

            with(dependencies) {
                add("detektPlugins", libs("detektFormatting"))
                add("detektPlugins", libs("detektComposeRules"))
            }

            configure<ApplicationExtension> {
                defaultConfig {
                    targetSdk = Configs.TARGET_SDK
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                    vectorDrawables {
                        useSupportLibrary = true
                    }
                }

                buildFeatures.compose = true

                packaging {
                    resources {
                        excludes += "/META-INF/{AL2.0,LGPL2.1}"
                    }
                }
            }

            configureAndroid()

            configure<DetektExtension> {
                buildUponDefaultConfig = true
                config.from.add("$rootDir/config/detekt/detekt.yml")
                config.from.add("$rootDir/config/detekt/detekt-compose.yml")
            }

            configure<KspExtension> {
                arg("skipPrivatePreviews", "true")
            }
        }
    }
}
