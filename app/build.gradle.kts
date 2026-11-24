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

androidComponents {
    onVariants { variant ->
        // Runs for both the test and the update task of the suite declared above.
        variant.suites["screenshotTest"]?.configureTestTasks {
            // TrendyolTheme reads Locale.getDefault(), so pin the locale and time zone to keep renders
            // identical across developer machines and CI.
            systemProperty("user.language", "en")
            systemProperty("user.country", "US")
            systemProperty("user.timezone", "UTC")
            // Gradle loads every suite class while looking for tests. This JVM gets Compose only as the
            // empty `jvmstubs` jars (the renderer gets the real Android ones), so a class extending a
            // Compose type such as PreviewParameterProvider fails to load. The renderer still uses them.
            exclude("**/*Provider.class")
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
