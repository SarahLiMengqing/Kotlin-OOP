package com.rsk

fun main() {
    val nums: Array<Int> = arrayOf(1)
    val ans: Int = try {
        nums[1]
    } catch (t: Throwable) {
        0
    }
    println("The answer is: $ans")



    /*try {
        throwException()
    } catch (e: Throwable) {
        println(e.message)
    } finally {
        println("Finally")
    }*/
}

fun throwException() {
    throw Exception("Something went wrong")
}