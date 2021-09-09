// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(BuildPlugins.androidGradlePlugin)
        classpath(BuildPlugins.googleService)
        classpath(BuildPlugins.kotlinGradlePlugin)
        classpath(BuildPlugins.hiltGradlePlugin)
        classpath(BuildPlugins.navigationGradlePlugin)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}