package com.tuo.common.ext


import android.util.Log
import java.io.File

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/6 16:49
 *     desc   : 创建文件夹
 *     version: 1.0
 * </pre>
 */


private const val TAG = "FileExt"

fun File.ensureDir(): Boolean {
    try {
        this.isDirectory.no {
            this.isFile.yes {
                delete()
            }
        }
        return mkdir()
    } catch (e: Exception) {
        Log.w(TAG, e.message)

    }
    return false
}