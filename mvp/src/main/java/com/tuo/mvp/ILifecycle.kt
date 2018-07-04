package com.tuo.mvp

import android.content.res.Configuration
import android.os.Bundle

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/4
 *     desc   : 生命周期
 *     version: 1.0
 * </pre>
 */
interface ILifecycle {

    fun onCreate(savedInstanceSate:Bundle?)

    fun saveInstanceState(outState:Bundle)

    fun onViewStateRestored(savedInstanceSate: Bundle?)

    fun onConfigurationChanaged(newConfig:Configuration)

    fun onSart()

    fun onResume()

    fun onPause()

    fun onStop()

    fun onDestroy()
}