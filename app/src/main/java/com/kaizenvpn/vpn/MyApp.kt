package com.kaizenvpn.vpn

import android.app.Application
import com.kaizenvpn.vpn.core.util.AppDebugTree
import com.onesignal.OneSignal
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

import com.onesignal.debug.LogLevel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// NOTE: Replace the below with your own ONESIGNAL_APP_ID
const val ONESIGNAL_APP_ID = "0a7f4962-56b0-422b-8548-3bdc0c78ad96"

/**
 * Created by Furuichi on 25/09/2023
 */
@HiltAndroidApp
class MyApp : Application() {



    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(AppDebugTree())
        } else {
            Thread.setDefaultUncaughtExceptionHandler { _, e ->
                //TDB
                e.printStackTrace()
            }
        }


//        // Verbose Logging set to help debug issues, remove before releasing your app.
//        OneSignal.Debug.logLevel = LogLevel.VERBOSE

        // OneSignal Initialization
        OneSignal.initWithContext(this, ONESIGNAL_APP_ID)




    }
}