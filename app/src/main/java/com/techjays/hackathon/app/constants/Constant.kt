package com.techjays.hackathon.app.constants

import android.Manifest

object Constant {

    internal var PREF_FILE_NAME = "hackathon"
    const val REQUEST_CODE_PERMISSION = 2


    const val DISCOVER_COLLECTION_TYPE = "collection"
    const val DISCOVER_FAYV_TYPE = "fayv"
    const val DISCOVER_FAYV_LIB_TYPE = "fayv_library"
    const val DISCOVER_SUGGESTED_TYPE = "suggested"

    // Date/Time Formats
    var DD_MM_YY = "dd-MM-yyyy" // 06-12-1993
    var YY_MM_DD = "yyyy-MM-dd" // 1993-12-06
    var YY_MM_DD_SLASH = "yyyy/MM/dd" // 1993/12/06
    var DD_MMM_YY = "dd MMM yyyy" // 06 Dec 1993
    var DD_MMM_YY_ZONE = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" // 2019-03-07T16:00:00.000-05:00
    var HH_MM = "HH:mm" // 20:30
    var HH_MM_AA = "hh:mm aa" // 10:30 AM

    var CAMERA = Manifest.permission.CAMERA
    var WRITE_EXTERNAL_STORAGE = Manifest.permission.WRITE_EXTERNAL_STORAGE
    var READ_EXTERNAL_STORAGE = Manifest.permission.READ_EXTERNAL_STORAGE
    var ACCESS_FINE_LOCATION = Manifest.permission.ACCESS_FINE_LOCATION
    var ACCESS_COARSE_LOCATION = Manifest.permission.ACCESS_COARSE_LOCATION



}
