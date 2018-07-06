package com.tuo.kotlingithub.utils

import com.tuo.common.ext.Preference
import com.tuo.kotlingithub.AppContext
import kotlin.reflect.jvm.jvmName

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/6 17:06
 *     desc   :
 *     version: 1.0
 * </pre>
 */

inline fun <reified R, T> R.pref(default: T) = Preference(AppContext, "", default, R::class.jvmName)