package com.tuo.mvp.impl

import android.content.res.Configuration
import android.os.Bundle
import com.tuo.mvp.IMvpView
import com.tuo.mvp.IPresenter

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/5
 *     desc   :
 *     version: 1.0
 * </pre>
 */
abstract class BasePresenter<out V: IMvpView<BasePresenter<V>>>: IPresenter<V> {

    override fun onCreate(savedInstanceSate: Bundle?) {

    }

    override fun saveInstanceState(outState: Bundle) {
    }

    override fun onViewStateRestored(savedInstanceSate: Bundle?) {
    }

    override fun onConfigurationChanaged(newConfig: Configuration) {
    }

    override fun onSart() {
    }

    override fun onResume() {
    }

    override fun onPause() {
    }

    override fun onStop() {
    }

    override fun onDestroy() {
    }
}