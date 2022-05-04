package com

/**
 * 타입추론과 함수
 *
 * 
 */
fun main() {
    
    //타입추론 : 자료형을 지정하지 않아도 선언시 할당할때 자료형으로 지정됨
    var a = 1234
    var b = 1234L

    var c = 12.45
    var d = 12.45f

    var e = 0xABCD
    var f = 0b0101010

    var g = true
    var h = 'c'

    println(add2(5, 6, 7))
}

fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

//단일 표현식 함수
//Single Expression function
fun add2(a: Int, b: Int, c: Int) = a + b + c