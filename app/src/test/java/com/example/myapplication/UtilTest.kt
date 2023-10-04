package com.example.myapplication

import org.junit.Assert.assertTrue
import org.junit.Test

class UtilTest {

    @Test
    fun test() {
        assertTrue(Util.isConsecutiveNumbers(arrayOf(1, 2, 3, 4, 5)))
    }
}