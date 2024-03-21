// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
    repositories{
        google()
    }
    dependencies{
        classpath (libs.daggerHiltGradlePlugin)
    }
}
plugins {
    alias(libs.plugins.androidApplicaton) apply false
    alias(libs.plugins.jetBrainsKotlin) apply false
    alias(libs.plugins.daggerHiltPlugin) apply false
}