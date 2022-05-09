package com

/**
 * 고차함수와 람다함수
 * 고차함수 higher-order function
 * 함수를 마치 클래스에서 만들어 낸 '인스턴스 처럼' 취급하는 방법 인데요
 * 함수를 '파라미터'로 넘겨줄 수도 있고
 * '결과값으로 반환' 받을 수도 있는 방법입니다
 */

fun main() {
    //함수 b를 호출하되 함수a를 파라미터로 넘겨줄텐데요
    //고차함수 형태로 넘기려면 함수 이름 앞에 콜론을 두개 붙여주면 됩니다.
    b(::a)


    //함수를 람다식으로 표현함
    val c: (String) -> Unit = { str -> println("$str 람다함수") }
    //람다함수는 그자체가 고차함수이기 때문에 연산자::가 필요없음
    b(c)

    //타입추론 기능을 이용하여 축약할수 있음
    val d = { str: String -> println("$str 축약람다함수") }
    b(d)

}

fun a(str: String) {
    println("$str 함수 a")
}

//반환형에는 값이 없다는 형식인 Unit을 써주면 됩니다
//이'함수의 형식'은 뒤에 람다함수 에도 사용 되므로

fun b(function: (String) -> Unit) {
    function("b 가 호출한")
}

