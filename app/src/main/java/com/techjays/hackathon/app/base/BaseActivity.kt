package com.techjays.hackathon.app.base

import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.techjays.hackathon.R
import com.techjays.hackathon.utils.AppDialogs
import com.techjays.hackathon.utils.Utility

/**
 * Created by Mathan on 17/08/20.
 **/

abstract class BaseActivity : AppCompatActivity() {

    abstract fun clickListener()

    abstract fun init()

    fun checkInternet(): Boolean {
        return Utility.isInternetAvailable(this)
    }

    fun getETValue(aEditText: EditText?): String {
        return aEditText?.text?.toString()?.trim { it <= ' ' } ?: ""
    }

    fun getTXTValue(aTextText: TextView?): String {
        return aTextText?.text?.toString()?.trim { it <= ' ' } ?: ""
    }

}