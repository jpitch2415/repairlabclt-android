plugins {
    id("com.android.application")
}

android {
    namespace = "com.repairlabclt.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.repairlabclt.app"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
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
}

dependencies {
    implementation("androidx.activity:activity:1.10.1")
    implementation("androidx.core:core:1.15.0")
}
