plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    signingConfigs {
        getByName("debug") {
            keyAlias = "sc"
            keyPassword = "3412163124"
        }
    }
    namespace = "com.example.skrootnext"
    compileSdk = 34

    defaultConfig {
        manifestPlaceholders += mapOf("zh_sc" to "3412163124")
        testInstrumentationRunnerArguments += mapOf("zh_sc" to "3412163124")
        applicationId = "com.linux.Skroot.next"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        proguardFiles("proguard-rules.pro")
        applicationIdSuffix = "kernel"
        versionNameSuffix = "100"
        signingConfig = signingConfigs.getByName("debug")
        multiDexEnabled = true
        resourceConfigurations += setOf()
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}