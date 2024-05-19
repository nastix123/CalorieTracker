plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}
apply(from="$rootDir/base-module.gradle")

android {
    namespace = "by.eapp.tracker_data"

}

dependencies {
    implementation(project(Modules.core))
    implementation(project(Modules.tracker_domain))

    //retrofit and room
}