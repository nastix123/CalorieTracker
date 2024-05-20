plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}
apply(from="$rootDir/compose-module.gradle")

android {
    namespace = "by.eapp.core-ui"
}
dependencies {
    testImplementation("junit:junit:4.12")
}

