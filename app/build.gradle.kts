plugins {
    alias(libs.plugins.androidApplicaton)
    alias(libs.plugins.jetBrainsKotlin)
    alias(libs.plugins.daggerHiltPlugin)
    id("kotlin-kapt")
}

android {
    namespace = "coder.bekhzod"
    compileSdk = 34

    defaultConfig {
        applicationId = "coder.bekhzod"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidCore)
    implementation(libs.androidLifecycle)
    implementation(libs.androidComposeActivity)
    implementation(platform(libs.androidComposeBom))
    implementation(libs.androidComposeUi)
    implementation(libs.androidComposeUiGraphics)
    implementation(libs.androidComposeUiToolingPreview)
    implementation(libs.androidComposeMaterial3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.extJunit)
    androidTestImplementation(libs.espresso)
    androidTestImplementation(platform(libs.androidTestComposeBom))
    androidTestImplementation(libs.uiTestJunit4)
    debugImplementation(libs.androidDebugTooling)
    debugImplementation(libs.androidTestManifest)
    implementation(project(":data"))
    implementation(project(":domain"))

    //  SplashScreen
    implementation(libs.splashScreenCore)

    //  Dagger Hilt
    implementation(libs.daggerHilt)
    kapt(libs.daggerHiltCompiler)

    //  Room Database
    implementation(libs.room)
    kapt(libs.roomKaptCompiler)

    //  Lottie animations
    implementation(libs.lottieAnimations)

    //  Navigation in compose
    implementation(libs.navigation)
}