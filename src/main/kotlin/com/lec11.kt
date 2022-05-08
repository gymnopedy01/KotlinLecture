package com

fun main() {

    var t = Tiger()
    t.eat()

    var r = Rabbit()
    r.eat()
    r.sniff()

}

//상속이 가능한 open을 사용
open class Animal11 {
    open fun eat() {
        println("음식을 먹습니다.")
    }
}

//수퍼클래스에서 'open'이 붙은 함수는
//서브클래스에서 'override' 를 붙여 재구현 하면 됩니다.
class Tiger : Animal11(){
    override fun eat() {
        println("고기를 먹습니다")
    }
}

//추상화 abstraction
//서브클래스가 비어있는 함수의 내용을 필요에 따라 구현하도록 하려면 추상화라는 개념을 사용
//추상화는 선언부만 있고 기능이 구현되지 않은 추상함수 그리고 추상 함수를 포함하는 추상 클래스 라는 요소로 구성됩니다.
abstract class Animal11Abs {
    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : Animal11Abs() {
    override fun eat() {
        println("당근을 먹습니다.")
    }

}

//인터페이스
// 추상함수로만 이루어져 있는 순수 추상화기능을 말하는 것
// 커틀린에서는 인터페이스 역시 추상함수와 일반함수를 모두 가질수 있습니다.
// 다만 추상함수는 생성자를 가질수 있는 반면 인터페이스는 생성자를 가질 수는 없으며
// 인터페이스에서
// 구현부가 있는 함수 -> open 함수로 간주
// 구현부가 없는 함수 -> abstract 함수로 간주
// 별도의 키워드가 없어도 포함된 모든 함수를 서브클래스에서 구현 및 재정이가 가능

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다.")
    }
}

class Dog11 : Runner, Eater {
    override fun run() {
        println("우다다다 뜁니다.")
    }

    override fun eat() {
        println("허겁지겁 먹습니다")
    }

}

//오버라이딩은 이미 구현이 끝난 함수의 기능을 서브 클래스에서 변경 해야할때
//그리고 추상화는 현식만 선언하고 실제구현은 서브 클래스에 일임 할때 사용하는 기능

// 인터페이스느 서로 다른 기능들을 여러개 물려주어야 할때 유용한 기능