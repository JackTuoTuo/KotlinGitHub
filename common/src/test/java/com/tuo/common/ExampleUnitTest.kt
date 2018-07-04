package com.tuo.common

import junit.framework.Assert
import org.junit.Test

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/4 10:32
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class ExampleUnitTest {


    @Test
    fun testBoolean() {
        val data = getABoolean()
                .yes {
                    println("yes")
                    1
                }
                .otherWise {
                    println("otherwise")
                    2
                }


        Assert.assertEquals(data, 2)

    }

    fun getABoolean() = false


}