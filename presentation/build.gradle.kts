plugins {
    // Application Specific Plugins
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinKapt)
    id(BuildPlugins.androidHilt)
    id(BuildPlugins.kotlinAndroidExtensions)
}
android {
    compileSdk = AndroidSdk.compile

    defaultConfig {
        minSdk = AndroidSdk.min
        targetSdk = AndroidSdk.target

        applicationId = AndroidClient.appId
        versionCode = AndroidClient.versionCode
        versionName = AndroidClient.versionName
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

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":data"))

    //Compile time dependencies
    kapt(Libraries.lifecycleCompiler)
    kapt(Libraries.hiltCompiler)
    kapt(Libraries.moshiKotlinCodegen)
    kapt(Libraries.roomCompiler)

    // Application dependencies
    implementation(Libraries.appCompat)
    implementation(Libraries.material)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.ktxCore)
    implementation(Libraries.liveData)
    implementation(Libraries.lifecycleExtensions)
    implementation(Libraries.rxAndroid)
    implementation(Libraries.rxKotlin)
    implementation(Libraries.timber)
    implementation(Libraries.hilt)
    implementation(Libraries.hiltNavigationFragment)
    implementation(Libraries.viewModel)
    implementation(Libraries.navigationFragment)
    implementation(Libraries.navigationUi)
    implementation(Libraries.navigationFeatures)
    implementation(Libraries.navigationCompose)
    implementation(Libraries.kakaoIConnectLive)
    implementation(Libraries.moshi)
    implementation(Libraries.roomRxjava3)
    implementation(Libraries.roomRuntime)

    // Unit/Android tests dependencies
    testImplementation(TestLibraries.junit4)

    // Acceptance tests dependencies
    androidTestImplementation(TestLibraries.testExtJunit)
    androidTestImplementation(TestLibraries.espressoCore)
    androidTestImplementation(TestLibraries.navigationTesting)
}