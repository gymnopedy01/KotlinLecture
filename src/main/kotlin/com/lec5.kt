package com

/**
 * 조건문과 비교연산자
 *
 * https://www.youtube.com/watch?v=gJJVLju4XS0&list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN&index=6
 */
fun main() {

    var a = 7

    if (a > 10) {
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작거나 같다")
    }

    //할당연산자 : =
    //자료형이 맞는지 체크하는 : is 연산자


    doWhen2(1)
    doWhen2("Dimo")
    doWhen2(12L)
    doWhen2(3.14159)
    doWhen2("Kotlin")


}

fun doWhen(a:Any) {
    when(a) {
        1-> println("정수 1 입니다")
        "Dimo" -> println("디모의 코틀린 강좌입니다")
        is Long -> println("Long 타입 입니다")
        !is String -> println("String 타입이 아닙니다")
        else -> println("어떤 조건도 만족하지 않습니다")
    }

}


fun doWhen2(a:Any) {
    var result = when(a) {
        1-> "정수 1 입니다"
        "Dimo" -> "디모의 코틀린 강좌입니다"
        is Long -> "Long 타입 입니다"
        !is String -> "String 타입이 아닙니다"
        else -> "어떤 조건도 만족하지 않습니다"
    }

    println(result)

}