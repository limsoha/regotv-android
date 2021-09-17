object Kotlin {
    const val standardLibrary = "1.5.30"
    const val coroutines = "1.3.9"
}

object AndroidSdk {
    const val min = 21
    const val compile = 31
    const val target = compile
}

object AndroidClient {
    const val appId = "com.regoworld.regotv"
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val testRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object BuildPlugins {
    object Versions {
        const val buildToolsVersion = "7.0.2"
        const val googleService = "4.3.4"
        const val gradleVersion = "6.8"
        const val hilt = "2.38.1"
        const val navigation = "2.3.5"
        const val room = "2.3.0"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val googleService = "com.google.gms:google-services:${Versions.googleService}"
    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.standardLibrary}"
    const val hiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
    const val navigationGradlePlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinKapt = "kotlin-kapt"
    const val androidHilt = "dagger.hilt.android.plugin"
    const val navigationSafeargs = "androidx.navigation.safeargs.kotlin"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
}

object ScriptPlugins {
    const val infrastructure = "scripts.infrastructure"
    const val variants = "scripts.variants"
    const val quality = "scripts.quality"
    const val compilation = "scripts.compilation"
}

object MavenUrls {
    const val kakaoenterprise = "https://icl.jfrog.io/artifactory/kakaoenterprise"
    const val jitpack = "https://jitpack.io"
}

object Libraries {
    private object Versions {
        const val hilt = BuildPlugins.Versions.hilt
        const val navigation = BuildPlugins.Versions.navigation
        const val appCompat = "1.2.0"
        const val constraintLayout = "2.0.2"
        const val recyclerView = "1.1.0"
        const val cardView = "1.0.0"
        const val material = "1.1.0"
        const val lifecycle = "2.2.0"
        const val lifecycleExtensions = "2.1.0"
        const val annotations = "1.1.0"
        const val ktx = "1.3.2"
        const val glide = "4.11.0"
        const val retrofit = "2.9.0"
        const val okHttpLoggingInterceptor = "4.9.0"
        const val navigationCompose = "2.4.0-alpha08"
        const val kakaoIConnectLive = "2.9.9"
        const val rxAndroid = "3.0.0"
        const val rxKotlin = "3.0.1"
        const val timber = "5.0.1"
        const val hiltNavigationFragment = "1.0.0"
        const val room = BuildPlugins.Versions.room
        const val roomPaging = "2.4.0-alpha04"
        const val moshi = "1.12.0"
        const val startup = "1.1.0"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Kotlin.standardLibrary}"
    const val kotlinCoroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Kotlin.coroutines}"
    const val kotlinCoroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Kotlin.coroutines}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycleExtensions =
        "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleExtensions}"
    const val cardView = "androidx.cardview:cardview:${Versions.cardView}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val androidAnnotations = "androidx.annotation:annotation:${Versions.annotations}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val retrofit = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val okHttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpLoggingInterceptor}"
    const val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val navigationFeatures = "androidx.navigation:navigation-dynamic-features-fragment:${Versions.navigation}"
    const val navigationCompose = "androidx.navigation:navigation-compose:${Versions.navigationCompose}"
    const val kakaoIConnectLive = "com.kakaoenterprise:kakao-i-connect-live:${Versions.kakaoIConnectLive}"
    const val rxAndroid = "io.reactivex.rxjava3:rxandroid:${Versions.rxAndroid}"
    const val rxKotlin = "io.reactivex.rxjava3:rxkotlin:${Versions.rxKotlin}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    const val hiltNavigationFragment = "androidx.hilt:hilt-navigation-fragment:${Versions.hiltNavigationFragment}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomRxjava3 = "androidx.room:room-rxjava3:${Versions.room}"
    const val roomPaging = "androidx.room:room-paging:${Versions.roomPaging}"
    const val moshi = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    const val moshiKotlinCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
    const val startup = "androidx.startup:startup-runtime:${Versions.startup}"
}

object TestLibraries {
    private object Versions {
        const val junit4 = "4.13.1"
        const val mockk = "1.10.0"
        const val robolectric = "4.4"
        const val kluent = "1.14"
        const val testRunner = "1.1.0"
        const val espressoCore = "3.2.0"
        const val espressoIntents = "3.1.0"
        const val testExtensions = "1.1.1"
        const val testRules = "1.1.0"
        const val hiltTesting = BuildPlugins.Versions.hilt
        const val navigationTesting = BuildPlugins.Versions.navigation
        const val roomTesting = BuildPlugins.Versions.room
    }

    const val junit4 = "junit:junit:${Versions.junit4}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
    const val kluent = "org.amshove.kluent:kluent:${Versions.kluent}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val testRules = "androidx.test:rules:${Versions.testRules}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val espressoIntents =
        "androidx.test.espresso:espresso-intents:${Versions.espressoIntents}"
    const val testExtJunit = "androidx.test.ext:junit:${Versions.testExtensions}"
    const val hiltTesting = "com.google.dagger:hilt-android-testing:${Versions.hiltTesting}"
    const val navigationTesting =
        "androidx.navigation:navigation-testing:${Versions.navigationTesting}"
    const val roomTesting = "androidx.room:room-testing:${Versions.roomTesting}"
}

object DevLibraries {
    private object Versions {
        const val leakCanary = "2.5"
    }

    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"
}
