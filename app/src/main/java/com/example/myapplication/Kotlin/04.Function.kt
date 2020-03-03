package com.example.myapplication.Kotlin

// 04. Function - 함수
// 어떤 input 을 넣어주면 어떤 output 나오는 것

// 함수를 선언하는 방법
// fun 함수명 (변수명: 타입, 변수명: 타입 ...) : 반환형 {
//     함수내용
//     return 반환값
// }

fun plus(first: Int, second: Int): Int {
    println(first)
    println(second)
    val result: Int = first + second
    println(result)
    return result
}

// 디폴트 값을 갖는 함수 만들기
fun plustFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// 반환값이 없는 함수 만들기
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

// 반환값이 없는 함수 만들기 2
fun printPlus2(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

// 간단하게 함수 만들기
fun plusShort(first: Int, second: Int) = first + second

// 가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int){
    for (number in numbers){
        println(number)
    }
}


fun main(array: Array<String>) {
    val result = plus(5, 10)
    println(result)

    val result2 = plus(first = 20, second = 30)
    println(result2)

    val result3 = plus(second = 100, first = 10)
    println("result는 " + result3)

    // 디폴트 값을 갖는 함수 호출하기
    println("-----------디폴트---------------")
    val result4 = plustFive(10, 20)
    println(result4)

    val result5 = plustFive(10)
    println(result5)

    printPlus(10, 20)
//    코드 정렬 ctrl+ alt + L
    println()
    val result6 = plusShort(50, 40)
    println(result6)

    println()
    plusMany(1,2,3)

}

