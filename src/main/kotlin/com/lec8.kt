package com

/**
 * 클래스의 기본구조
 *
 * 객제지향을 기반으로로 함수형 언어의 장점을 흡수한 실용적인 언어 입니다.
 *
 */

fun main() {
    var a = Person9("박보영", 1990)
    var b = Person9("전정구", 1997)
    var c = Person9("장원영", 2004)

    println("안녕하세요. ${a.birthYear}년생 ${a.name}입니다")

    a.introduce()
    b.introduce()
    c.introduce()

}

class Person9(var name: String, val birthYear: Int) {
    fun introduce() {
        println("안녕하세요, ${birthYear}년생 ${name}입니다.")
    }
}