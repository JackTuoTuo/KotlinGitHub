package com.tuo.mvp.impl

import android.app.Fragment
import com.tuo.mvp.IMvpView

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/5
 *     desc   :
 *     version: 1.0
 * </pre>
 */
abstract class BaseFragment<out P:BasePresenter<IMvpView<P>>>: IMvpView<P>,Fragment() {
}