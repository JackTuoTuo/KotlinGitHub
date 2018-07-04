package com.tuo.common

import android.annotation.SuppressLint
import android.content.Context
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/4 14:09
 *     desc   : SharedPreferences 扩展
 *     version: 1.0
 * </pre>
 */


class Preference<T>(val context: Context, val name: String, val defaultValue: T, val preferenceName: String = "default")
    : ReadWriteProperty<Any?, T> {

    private val prefs by lazy {
        context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE)
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        putPreference(name, value)
    }


    @SuppressLint("CommitPrefEdits")
    private fun putPreference(key: String, value: T) {

        with(prefs.edit()) {
            when (value) {
                is Long -> putLong(key, value)
                is Int -> putInt(key, value)
                is Boolean -> putBoolean(key, value)
                is Float -> putFloat(key, value)
                is String -> putString(key, value)
                else -> throw IllegalArgumentException("UnSupported type")
            }
        }.apply()

    }


    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return findPreference(name)
    }

    private fun findPreference(key: String): T {
        return when (defaultValue) {
            is Long -> prefs.getLong(key, defaultValue)
            is Int -> prefs.getInt(key, defaultValue)
            is Boolean -> prefs.getBoolean(key, defaultValue)
            is Float -> prefs.getFloat(key, defaultValue)
            is String -> prefs.getString(key, defaultValue)
            else -> throw IllegalArgumentException("UnSupported type")
        } as T
    }

}