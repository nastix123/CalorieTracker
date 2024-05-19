plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}
apply(from="$rootDir/base-module.gradle")

android {
    namespace = "by.eapp.tracker_domain"

}

dependencies {
    implementation(project(Modules.core))

}