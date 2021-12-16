package com.techjays.hackathon.app.activity

import android.annotation.SuppressLint
import android.content.pm.ShortcutManager
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.techjays.hackathon.R
import com.techjays.hackathon.api.Response
import com.techjays.hackathon.api.ResponseListener
import com.techjays.hackathon.app.base.BaseActivity
import com.techjays.hackathon.app.base.FragmentManager
import com.techjays.hackathon.utils.Utility
import de.hdodenhof.circleimageview.CircleImageView


class MainActivity : BaseActivity(), ResponseListener,
    BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var mFragmentManager: FragmentManager
    private lateinit var mShortcutManager: ShortcutManager

    private lateinit var mBottomNavImage: CircleImageView
    private lateinit var mBottomNav: BottomNavigationView

    private var mSelectedCount = 1
    private var doubleBackToExit = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discover)
        if (!Utility.isUsingNightModeResources(applicationContext!!))
            Utility.statusBarColor(window, applicationContext!!, R.color.app_white)
        else
            window.decorView.systemUiVisibility = 0

        init()
    }

    override fun clickListener() {
    }

    @SuppressLint("NewApi")
    override fun init() {
        mFragmentManager = FragmentManager(this)

        mShortcutManager = getSystemService(ShortcutManager::class.java)

    }

    override fun onResponse(r: Response?) {
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return true
    }
    }

