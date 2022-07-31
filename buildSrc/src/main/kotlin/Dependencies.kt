object Version {
    const val KOTLIN_STDLIB = "1.7.10"
    const val NAVIGATION = "2.3.5"
}

object Library {
    object Kotlin {
        const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Version.KOTLIN_STDLIB}"
    }

    object AndroidX {
        const val NAVIGATION_RUNTIME_KTX = "androidx.navigation:navigation-runtime-ktx:${Version.NAVIGATION}"
        const val NAVIGATION_FRAGMENT_KTX = "androidx.navigation:navigation-fragment-ktx:${Version.NAVIGATION}"
        const val NAVIGATION_UI_KTX = "androidx.navigation:navigation-ui-ktx:${Version.NAVIGATION}"
    }
}