package com.tuo.common.log

import org.slf4j.Logger
import org.slf4j.LoggerFactory


/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/6 16:49
 *     desc   :
 *     version: 1.0
 * </pre>
 */

val loggerMap = HashMap<Class<*>, Logger>()


inline val <reified T> T.logger: Logger
    get() {
        return loggerMap[T::class.java] ?: LoggerFactory.getLogger(T::class.java).apply { loggerMap[T::class.java] = this }
    }