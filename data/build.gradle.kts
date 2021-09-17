plugins {
    id(BuildPlugins.androidLibrary)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinKapt)
    id(BuildPlugins.androidHilt)
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
}

dependencies {
    implementation(project(":domain"))

    //Compile time dependencies
    kapt(Libraries.hiltCompiler)
    kapt(Libraries.roomCompiler)

    // Application dependencies
    implementation(Libraries.ktxCore)
    implementation(Libraries.rxKotlin)
    implementation(Libraries.kakaoIConnectLive)
    implementation(Libraries.hilt)
    implementation(Libraries.roomRuntime)
    implementation(Libraries.roomRxjava3)
    implementation(Libraries.moshi)
    // Unit/Android tests dependencies
    testImplementation(TestLibraries.junit4)
    // Acceptance tests dependencies
    androidTestImplementation(TestLibraries.testExtJunit)
    androidTestImplementation(TestLibraries.espressoCore)
    androidTestImplementation(TestLibraries.navigationTesting)
}