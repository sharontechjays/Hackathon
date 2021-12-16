package com.techjays.hackathon.app.base

import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.techjays.hackathon.R
import com.techjays.hackathon.utils.AppDialogs
import com.techjays.hackathon.utils.Utility

/**
 * Created by Mathan on 17/08/20.
 **/

abstract class BaseFragment : Fragment() {

    abstract fun onBackPressed()

    abstract fun onResumeFragment()

    abstract fun init(view: View)

    abstract fun initBundle()

    abstract fun clickListener()

    fun checkInternet(): Boolean {
        return Utility.isInternetAvailable(this.context)
    }

    override fun onResume() {
        onResumeFragment()
        super.onResume()
    }

    fun getETValue(aEditText: EditText?): String {
        return aEditText?.text?.toString()?.trim { it <= ' ' } ?: ""
    }

    fun getTXTValue(aTextText: TextView?): String {
        return aTextText?.text?.toString()?.trim { it <= ' ' } ?: ""
    }

}
