package com.tuo.kotlingithub.utils

import com.google.gson.Gson

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/6 17:06
 *     desc   : Gson 解析
 *     version: 1.0
 * </pre>
 */


inline fun <reified T> Gson.fromGson(json: String): T = this.fromJson(json, T::class.java)

