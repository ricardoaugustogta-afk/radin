// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id("com.android.application") version "7.4.0"
    kotlin("android") version "1.8.0"
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.application"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}
