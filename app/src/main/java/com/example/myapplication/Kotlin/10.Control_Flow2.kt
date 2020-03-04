package com.example.myapplication.Kotlin

// 10. 제어 흐름

// When

fun main(args: Array<String>){

    val value: Int = 3

    when(value) {
        1 -> println("11111")
        2 -> println("22222")
        3 -> println("33333")
        else -> println("????")
    }

    val value2 = when(value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)


}