package com

/**
 * 클래스의 생성자
 *
 * 새로운 인스턴스를 만들기 위해 호출하는
 * 특수한 함수
 *
 * 인스턴스의 속성을 초기화 인스턴스 생성시 구문을 수행하는 기능
 *
 * 클래스를 만들때 기본으로선언 기본생성자
 * 필요에 따라 추가적으로 선언 보조 생성자
 *
 * */
fun main() {

    var a = Person("박보영", 1990)
    var b = Person("전정구", 1997)
    var c = Person("장원영", 2004)

    var d = Person("이루다");
    var e = Person("차은우");
    var f = Person("류수정");

}

class Person(var name: String, val birthYear: Int) {
    init {
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }

    // 보조생성자
    // 기본생서자와 다른형태의 생성자를 제공하여
    // 인스생성시 편의를 제공하거나 추가적인 구문을 수행하는 제공하는 역할
    constructor(name: String) : this(name, 1997) {
        println("보조생성자가 사용되었습니다.")
    }
}