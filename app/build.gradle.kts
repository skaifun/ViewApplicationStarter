plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
    alias(libs.plugins.kotlinx.serialization)
}

android {
    namespace = "org.demo.starter"
    compileSdk = 34

    defaultConfig {
        applicationId = "org.demo.starter"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        viewBinding = true
        buildConfig = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        // enable core library desugaring
        isCoreLibraryDesugaringEnabled = true

        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // core library desugaring
    coreLibraryDesugaring(libs.corelibdesugaring)
    // retrofit
    implementation(libs.bundles.retrofit)
    // kotlin serialization
    implementation(libs.kotlinx.serialization.json)
    // okhttp
    implementation(libs.bundles.okhttp)
    // coil
    implementation(libs.bundles.coil)
    // timber
    implementation(libs.timber)
    // hilt
    implementation(libs.bundles.hilt.android)
    // room
    implementation(libs.bundles.androidx.room)
    ksp(libs.androidx.room.compiler)
    // navigation
    implementation(libs.bundles.androidx.navigation)
    // lifecycle
    implementation(libs.bundles.androidx.lifecycle)
    // recyclerview selection
    implementation(libs.androidx.recyclerview.selection)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}