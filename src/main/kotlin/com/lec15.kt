package com


/**
 * 람다함수의 특별한 케이스들
 * 1.람다함수도 여러줄 사용이 가능. 마지막 줄이 리턴됨
 * ex) val calculate:(Int,Int) -> Int = {a,b ->
 *          println(a)
 *          println(b)
 *          a+b     //여기서 마지막 구문인 a+b의 값을 In로 반환함
 *     }
 * 2.람다함수에 파라미터가 없다면? 실행할 구문들만 나열하면 됩니다!
 * ex) val a:() -> Unit = {println("파라미터가 없어요")}
 * 3. 파라미터가 하나뿐이라면 it 사용
 * ex) val c:(String) -> Unit = {println("$it 람다함수")}
 */

/**
 * 스코프 함수
 * 함수형 언어의 특징을 좀더 편리하게 사용할수 있도록 기본제공하는 함수들
 * apply 인스턴스를 생성한후 변수에 담기전에 '초기화 과정'을 수행할때 많이 쓰이는데요
 * run  run 스코프 안에서 참조연산자를 사용하지 않아도 된다는 점은 같지만 일반람다함수처럼 인스턴스 대신 마지막 줄이 리턴됨
 * with run 과 동일한 기능을 가지지만 단지 인스턴스를 참조여난자 대신 파라미터로 받는 다는 차이 ex) a.run{...} with(a) {...}
 * also 처리가 끝나면 인스턴스를 반환
 * let 처리가 끝나면 최종값을 반환
 */
fun main() {

    var price = 5000

    var a = Book("디모의 코틀린", 10000).apply {
        name = "[초특가]" + name
        discount()
    }
    a.run {
        println("상품명:${name}, 가격: ${price}원")
    }

    a.let {
        println("상품명:${it.name}, 가격: ${it.price}원")
    }
}

class Book(var name: String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}