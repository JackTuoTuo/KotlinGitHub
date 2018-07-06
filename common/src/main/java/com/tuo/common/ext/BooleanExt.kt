package com.tuo.common.ext

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/4 10:55
 *     desc   : Boolean 扩展
 *     version: 1.0
 * </pre>
 */


sealed class BooleanExt<out T>

object OtherWise : BooleanExt<Nothing>()

class WithData<T>(val data: T) : BooleanExt<T>()


inline fun <T> Boolean.yes(block: () -> T) =
        when (this) {
            true -> WithData(block())
            else -> OtherWise
        }


inline fun <T> Boolean.no(block: () -> T) =
        when (this) {
            false -> WithData(block())
            else -> OtherWise
        }


inline fun <T> BooleanExt<T>.otherWise(block: () -> T) =
        when (this) {
            is OtherWise -> block()
            is WithData -> this.data
        }


