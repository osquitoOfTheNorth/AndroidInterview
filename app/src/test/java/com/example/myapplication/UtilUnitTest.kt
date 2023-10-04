package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

class UtilUnitTest {
    @Test
    fun validateIsConsecutiveNumbers() {
        assertTrue(Util.isConsecutiveNumbers(arrayOf(5, 1, 4, 3, 2)))
        assertTrue(Util.isConsecutiveNumbers(arrayOf(-1, -2, 0)))
        assertTrue(Util.isConsecutiveNumbers(arrayOf(5)))
        assertFalse(Util.isConsecutiveNumbers(arrayOf(5, 1, 4, 3, 2, 8)))
        assertFalse(Util.isConsecutiveNumbers(arrayOf(5, 6, 7, 8, 9, 9)))
    }
}