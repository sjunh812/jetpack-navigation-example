plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = 32
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = "org.sjhstudio.jetpacknavigation"
        minSdk = 24
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
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
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    dataBinding {
        isEnabled = true
    }

    viewBinding {
        isEnabled = true
    }

    dependencies {
        implementation(Library.Kotlin.KOTLIN_STDLIB)

        implementation(Library.AndroidX.CORE_KTX)
        implementation(Library.AndroidX.MATERIAL)
        implementation(Library.AndroidX.APPCOMPAT)
        implementation(Library.AndroidX.CONSTRAINT_LAYOUT)
        implementation(Library.AndroidX.NAVIGATION_RUNTIME_KTX)
        implementation(Library.AndroidX.NAVIGATION_FRAGMENT_KTX)
        implementation(Library.AndroidX.NAVIGATION_UI_KTX)
        androidTestImplementation(Library.AndroidX.TEST_JUNIT)
        androidTestImplementation(Library.AndroidX.ESPRESSO)

        testImplementation(Library.JUNIT.JUNIT)
    }
}