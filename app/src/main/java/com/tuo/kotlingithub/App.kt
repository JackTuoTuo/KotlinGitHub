package com.tuo.kotlingithub

import android.annotation.SuppressLint
import android.app.Application
import android.content.ContextWrapper

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/4 14:50
 *     desc   : 全局 application
 *     version: 1.0
 * </pre>
 */

@SuppressLint("StaticFieldLeak")
private lateinit var INSTANCE: Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }
}

object AppContext : ContextWrapper(INSTANCE)

