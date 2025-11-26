package com.rsk

fun main() {
    val b: Byte = 1
    val s: Short = 23333
    val num = 8
    val l: Long = 233333333_0000
    println(l)

    val arr: IntArray = intArrayOf(1, 2, 3)
    val arr1: Array<String> = arrayOf<String>("one", "two", "three")

    println(arr1.contentToString())
    println("${arr[0]} ${arr[1]} ${arr[2]}")
}