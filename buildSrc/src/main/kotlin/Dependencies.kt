object Version {
    const val KOTLIN_STDLIB = "1.7.10"

    const val CORE_KTX = "1.8.0"
    const val MATERIAL = "1.6.1"
    const val APPCOMPAT = "1.4.2"
    const val CONSTRAINT_LAYOUT = "2.1.4"
    const val NAVIGATION = "2.3.5"
    const val TEST_JUNIT = "1.1.3"
    const val ESPRESSO = "3.4.0"

    const val JUNIT = "4.13.2"
}

object Library {
    object Kotlin {
        const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Version.KOTLIN_STDLIB}"
    }

    object AndroidX {
        const val CORE_KTX = "androidx.core:core-ktx:${Version.CORE_KTX}"
        const val MATERIAL = "com.google.android.material:material:${Version.MATERIAL}"
        const val APPCOMPAT = "androidx.appcompat:appcompat:${Version.APPCOMPAT}"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Version.CONSTRAINT_LAYOUT}"
        const val NAVIGATION_RUNTIME_KTX = "androidx.navigation:navigation-runtime-ktx:${Version.NAVIGATION}"
        const val NAVIGATION_FRAGMENT_KTX = "androidx.navigation:navigation-fragment-ktx:${Version.NAVIGATION}"
        const val NAVIGATION_UI_KTX = "androidx.navigation:navigation-ui-ktx:${Version.NAVIGATION}"
        const val TEST_JUNIT = "androidx.test.ext:junit:${Version.TEST_JUNIT}"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:${Version.ESPRESSO}"
    }

    object JUNIT {
        const val JUNIT = "junit:junit:${Version.JUNIT}"
    }
}
