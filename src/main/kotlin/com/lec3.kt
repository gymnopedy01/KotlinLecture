package com

/**
 * 형변환과 배열
 *
 * https://www.youtube.com/watch?v=tvtNch-GPEU&list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN&index=3
 * 
 * 코틀린은 암시적 형변환을 지원하지 않음
 * 명시적 형변환 : 변환될 자료형을 개발자가 직접 지정해야함
 */
fun main() {

    var a: Int = 54321
    var b: Long = a.toLong()

    var intArr = arrayOf(1, 2, 3, 4, 5)
    var nullArr = arrayOfNulls<Int>(5)

    intArr[2] = 8
    println(intArr[4])

}
