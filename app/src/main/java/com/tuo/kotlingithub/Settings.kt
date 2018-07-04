package com.tuo.kotlingithub

import com.tuo.common.Preference

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/4 14:46
 *     desc   :
 *     version: 1.0
 * </pre>
 */


object Settings {

    var email: String by Preference(AppContext, "email", "")

    var password: String by Preference(AppContext, "password", "")
}