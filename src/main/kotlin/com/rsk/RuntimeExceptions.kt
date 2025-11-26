package com.rsk

fun main() {
    val nums: Array<Int> = arrayOf(5)

    try {
        val num: Int = nums[1]
    } catch (t: Throwable) {
        println(t.message)
    }
}