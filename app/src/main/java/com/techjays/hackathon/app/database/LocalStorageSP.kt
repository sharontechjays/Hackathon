package com.techjays.hackathon.app.database

import android.content.Context
import android.content.SharedPreferences
import com.techjays.hackathon.app.constants.Constant


object LocalStorageSP {

    private fun getEditor(c: Context): SharedPreferences.Editor {
        return getPreference(c).edit()
    }

    private fun getPreference(c: Context): SharedPreferences {
        return c.getSharedPreferences(
            Constant.PREF_FILE_NAME, Context.MODE_PRIVATE
        )
    }

    fun put(c: Context, key: String, value: String) {
        val editor = getEditor(c)
        editor.putString(key, value)
        editor.commit()
    }

    /**
     * @param c   Context
     * @param key key
     * @param dv  default value
     */
    operator fun get(c: Context, key: String, dv: String): String? {
        return getPreference(c).getString(key, dv)
    }

    /**
     * @param c     Context
     * @param key   key
     * @param value value
     */
    fun put(c: Context, key: String, value: Int) {
        val editor = getEditor(c)
        editor.putInt(key, value)
        editor.commit()
    }

    /**
     * @param c   Context
     * @param key key
     * @param dv  default value
     */
    operator fun get(c: Context, key: String, dv: Int): Int? {
        return getPreference(c).getInt(key, dv)
    }

    /**
     * @param c     Context
     * @param key   key
     * @param value value
     */
    fun put(c: Context, key: String, value: Boolean) {
        val editor = getEditor(c)
        editor.putBoolean(key, value)
        editor.commit()
    }

    /**
     * @param c   Context
     * @param key key
     * @param dv  default value
     */
    operator fun get(c: Context, key: String, dv: Boolean): Boolean? {
        return getPreference(c).getBoolean(key, dv)
    }

    fun clearAll(c: Context) {
        val editor = getEditor(c)
        editor.clear()
        editor.commit()
    }

    fun clear(c: Context, key: String) {
        val editor = getEditor(c)
        editor.remove(key)
        editor.commit()
    }




}
