package com

/**
 * 클래스의 상속
 *
 * 기존클래스를 확장하여 새로운 클래스를 만들때
 *
 * 수퍼클래스, 서브클래스
 */
fun main() {

    var a = Animal("별이", 5, "개")
    var b = Dog("별이", 5)

    a.introduce()
    b.introduce()

    b.bark()

    var c = Cat("루이", 1)
    c.introduce()
    c.meow();
}

open class Animal(var name: String, var age: Int, var type: String) {
    fun introduce() {
        println("저는 ${type}, ${name}이고, ${age}살 입니다.")
    }
}

// 1서브클래스는 수퍼클래스에 존재하는 속성과 '같은 이름' 의 속성을 가질 수 없음
// 2서브 클래스가 생성될 때는 반드시 수퍼클래스의 생성자 까지 호출되어야함
class Dog(name: String, age: Int) : Animal(name, age, "개") {
    fun bark() {
        println("멍멍")
    }
}

class Cat(name: String, age: Int) : Animal(name, age, "고양이") {
    fun meow() {
        println("야옹야옹")
    }
}