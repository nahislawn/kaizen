plugins {
    id("com.android.application") version "7.0.0"
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    id("androidx.navigation.safeargs.kotlin")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
}

android {
    namespace = "com.kaizenvpn.vpn"
    compileSdk = Config.Version.compileSdk

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.Version.minSdk
        targetSdk = Config.Version.targetSdk
        versionCode = _autoGenVersionCode
        versionName = Config.versionName

        manifestPlaceholders["admobId"] = Config.admobId

        buildConfigField("String", "ADMOB_ID", "\"${Config.admobId}\"")
    }

    signingConfigs {
        create("release") {
            keyAlias = "key0"
            keyPassword = "12345678"
            storeFile = file("key/kaiven_vpn.jks")
            storePassword = "12345678"
        }
    }

    buildTypes {
        debug {
            signingConfig = signingConfigs.getByName("release")
        }
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs += arrayOf(
            "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
            "-opt-in=kotlinx.coroutines.FlowPreview",
            "-opt-in=kotlinx.coroutines.DelicateCoroutinesApi",
            "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
            "-opt-in=kotlinx.coroutines.ObsoleteCoroutinesApi"
        ).toList()
    }
    packaging {
        jniLibs {
            useLegacyPackaging = true
        }
    }
    buildFeatures {
        viewBinding = true
    }
    sourceSets {
        getByName("main") {
            res {
                srcDirs("src\\main\\res", "src\\main\\res-flag")
            }
        }
    }

    hilt {
        enableAggregatingTask = true
    }

}

dependencies {
    implementation(project(":iap"))
    implementation(project(":ovpn"))

    //AndroidX
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.activity:activity-ktx:1.7.2")
    implementation("androidx.fragment:fragment-ktx:1.6.1")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.3")
    implementation("androidx.hilt:hilt-navigation-fragment:1.0.0")
    implementation("androidx.datastore:datastore-preferences:1.0.0")

    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")

    //Network
    implementation("com.airbnb.android:lottie:4.0.0")
    implementation("com.squareup.okhttp3:okhttp:4.11.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.github.bumptech.glide:glide:4.14.2")

    //Hilt
    val hilt_version = "2.48"
    implementation("com.google.dagger:hilt-android:$hilt_version")
    kapt("com.google.dagger:hilt-compiler:$hilt_version")

    //Logger
    implementation("com.jakewharton.timber:timber:4.7.1")

    //Firebase
    implementation(platform("com.google.firebase:firebase-bom:32.3.1"))
    implementation("com.google.firebase:firebase-crashlytics-ktx")
    implementation("com.google.firebase:firebase-analytics-ktx")
    implementation("com.google.firebase:firebase-auth-ktx")
    implementation("com.google.firebase:firebase-firestore-ktx")

    //Ad
    implementation("com.google.android.gms:play-services-ads:22.4.0")

    //LottieFiles
    implementation("com.airbnb.android:lottie:4.0.0")

    //facebook shimmer
    implementation("com.facebook.shimmer:shimmer:0.5.0")

    //onesignal
    implementation("com.onesignal:OneSignal:[5.0.0, 5.99.99]")
    implementation("com.loopj.android:android-async-http:1.4.11")
    implementation("com.android.volley:volley:1.2.1")

}