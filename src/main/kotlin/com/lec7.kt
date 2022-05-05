package com

/**
 * 흐름제어와 논리 연산자
 * https://www.youtube.com/watch?v=gMuxnwDYKhc
 */
fun main() {

    //break
    for (i in 1..10) {
        if (i == 3) break
        println(i)
    }

    //continue
    for (i in 1..10) {
        if (i == 3) continue
        println(i)
    }

    //코틀린의 추가기능 label
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i == 1 && j == 2) break@loop
            println("i: $i, j: $j")
        }
    }

    println(true && false)
    println(true || false)

    var a = 6
    var b = 4

    println(a > 5 && b > 5)

}