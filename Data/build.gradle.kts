plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.apt.notes"
    compileSdk = 35
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {

    implementation(project(":core"))

}