package com.example.myapplication.Kotlin

// 11. 제어흐름 실습

fun main(args: Array<String>) {

    val value: Int? = null

    when (value) {
        null -> println("null~~~~")

        else -> println("not null~~~")
    }

    val value2: Boolean? = null

//    when 구문은 조건으로 갖는 값의 모든 경우에 대응 해주는 것이 좋다

    when (value2) {
        true -> println("true")
        false -> println("false")
        null -> println("null")
    }
//    값을 리턴하는 when 구문의 경우 반듯이 값을 리턴해야 한다.
    val value3 = when (value2) {
        true -> 1
        false -> 3
        else -> 1515
    }
//    when의 다양한 조건식(1)
    val value4: Int = 10
    when (value4) {
        is Int -> {
            println("int type!!")
        }
        else -> {
            println("nonono")
        }
    }
//    when의 다양한 조건식(2)
    val value5: Int = 87
    when (value5) {
        in 60..70 -> {
            println("60~~~70")
        }
        in 70..80 -> {
            println("70~~~80")
        }
        in 80..90 -> {
            println("80~~~90")
        }
    }

}