plugins {
    // Application Specific Plugins
    id(BuildPlugins.androidLibrary)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinKapt)
}

android {
    compileSdk = AndroidSdk.compile

    defaultConfig {
        minSdk = AndroidSdk.min
        testInstrumentationRunner = AndroidClient.testRunner
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
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {

    // Application dependencies
    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.kotlinCoroutines)
    implementation(Libraries.kotlinCoroutinesAndroid)
    implementation(Libraries.ktxCore)

    // Unit/Android tests dependencies
    testImplementation(TestLibraries.junit4)

    // Acceptance tests dependencies
    androidTestImplementation(TestLibraries.testExtJunit)
    androidTestImplementation(TestLibraries.espressoCore)
    androidTestImplementation(TestLibraries.navigationTesting)
}