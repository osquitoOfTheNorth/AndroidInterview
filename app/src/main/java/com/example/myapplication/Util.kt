package com.example.myapplication

object Util {

    /**
     * This function determines whether the elements in an array can be
     * re-arranged to form a consecutive list of numbers where each
     * number appears exactly once.
     *
     * return True if the array can be re-arranged meeting the criteria
     */
    fun isConsecutiveNumbers (int: Array<Int>) : Boolean {
        int.sort()
        int.forEachIndexed { index, i ->
            if(index < int.size - 1 && i + 1 != int[index + 1]) {
                return false
            }
        }
        return true
    }
}