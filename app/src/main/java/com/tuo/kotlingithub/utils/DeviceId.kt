package com.tuo.kotlingithub.utils

import android.content.Context
import android.provider.Settings

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/6 17:06
 *     desc   :
 *     version: 1.0
 * </pre>
 */

val Context.deviceId: String
    get() = Settings.Secure.getString(
            contentResolver,
            Settings.Secure.ANDROID_ID
    )