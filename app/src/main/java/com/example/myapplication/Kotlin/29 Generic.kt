package com.example.myapplication.Kotlin

// 29. Generic(제너릭)
// 목적 : 다양한 타입의 객체들을 다루는 메서드나 컬렉션
//        클래스에서 컴파일 시에 타입을 체크해주는 기능
// - 제너릭은 만드기 어렵고 실제로 만들 일이 거의 없기 때문에 사용 하는 방법만 숙지한다.

fun main(args:Array<String>){

    // 제너릭을 사용하지 않은 경우
    // 형 변환을 해줘야 한다.
    val list1 = listOf(1,2,3,"가")
    val b : String = list1[2].toString() // 형 변환(타입 변환)

    // 제너릭을 사용하는 경우
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2] // String 이라는 것을 보장 받는다.

    // 강한 타입을 체크 할 수 있다.
    val list3 = listOf(1,2,3,4,"가","나",3.0)
    val list4 = listOf<Int>(1,2,3,"가") // 강한 타입 체크

    // 제너릭을 사용 하지 않은 경우
    val list5 = listOf(1,2,3,"가") // -> any
    // 부모 : Any
    // 자식 : String, Int, Float

}