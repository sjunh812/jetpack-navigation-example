plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
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
        val nav_version = "2.5.0"

        // Kotlin
        implementation("androidx.core:core-ktx:1.8.0")
        implementation(Libs.KOTLIN_STDLIB)
//        implementation("org.jetbrains.kotlin:kotlin-stdlib:1.7.10")

        // Material
        implementation("com.google.android.material:material:1.6.1")

        // AndroidX
        implementation("androidx.appcompat:appcompat:1.4.2")
        implementation("androidx.constraintlayout:constraintlayout:2.1.4")
        implementation("androidx.navigation:navigation-runtime-ktx:$nav_version")
        implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
        implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
        implementation("androidx.navigation:navigation-compose:$nav_version")

        // Test
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.3")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    }
}

//plugins {
//    id 'com.android.application'
//    id 'org.jetbrains.kotlin.android'
//    id 'kotlin-kapt'
//    id 'kotlin-parcelize'
//}
//
//android {
//    compileSdk 32
//
//    defaultConfig {
//        applicationId "org.sjhstudio.jetpacknavigation"
//        minSdk 24
//        targetSdk 32
//        versionCode 1
//        versionName "1.0"
//
//        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildTypes {
//        release {
//            minifyEnabled false
//            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
//        }
//    }
//
//    compileOptions {
//        sourceCompatibility JavaVersion.VERSION_1_8
//        targetCompatibility JavaVersion.VERSION_1_8
//    }
//
//    kotlinOptions {
//        jvmTarget = '1.8'
//    }
//
//    dataBinding {
//        enabled = true
//    }
//
//    viewBinding {
//        enabled = true
//    }
//}
//
//dependencies {
//    def nav_version = "2.5.0"
//
//    implementation 'androidx.core:core-ktx:1.8.0'
//    implementation 'androidx.appcompat:appcompat:1.4.2'
//    implementation 'com.google.android.material:material:1.6.1'
//    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
//    testImplementation 'junit:junit:4.13.2'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
//
//    implementation "androidx.navigation:navigation-runtime-ktx:$nav_version"
//    implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
//    implementation "androidx.navigation:navigation-ui-ktx:$nav_version"
//    implementation "androidx.navigation:navigation-compose:$nav_version"
//}