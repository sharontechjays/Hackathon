package com.techjays.hackathon.app.constants

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.os.Bundle
import android.provider.Settings.Secure
import com.facebook.appevents.AppEventsLogger
import com.google.firebase.FirebaseApp
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase


class HackathonApplication : Application() {
    lateinit var ScreenNames :String
    var deviceId = ""
    var deviceType = "android"
    var deviceName = ""
    var isDashboard = false
    private lateinit var mFirebaseAnalytics: FirebaseAnalytics

    @SuppressLint("HardwareIds")
    override fun onCreate() {
        super.onCreate()

        mContext = this
        deviceId = Secure.getString(contentResolver, Secure.ANDROID_ID)
        deviceName = android.os.Build.MANUFACTURER

        AppEventsLogger.activateApp(this)
        FirebaseApp.initializeApp(this)
        mFirebaseAnalytics = Firebase.analytics

     
    }




    /**
     * Register Screen Name in Firebase
     */
    fun registerScreenName(screenName: String, className: String) {
        val bundle = Bundle().apply {
            ScreenNames = screenName
            this.putString(FirebaseAnalytics.Param.SCREEN_NAME, screenName)
            this.putString(FirebaseAnalytics.Param.SCREEN_CLASS, className)
        }
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, bundle)
    }

    fun getDp(pixel: Int): Int {
        val density = instance().resources.displayMetrics.density
        val dp = pixel / density
        return dp.toInt()
    }

    fun getPixel(dp: Int): Int {
        val density = instance().resources.displayMetrics.density
        val px = dp * density
        return px.toInt()
    }

    companion object {

        @SuppressLint("StaticFieldLeak")
        private var mContext: Context? = null

        fun instance(): HackathonApplication {
            return mContext!!.applicationContext as HackathonApplication
        }
    }
}
