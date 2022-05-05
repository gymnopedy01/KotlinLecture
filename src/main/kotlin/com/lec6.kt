package com

/**
 * 조건문과 증감 연산자
 *
 * 조건이 참인경우 반복을 유지 : 조건형 반복문
 * 반복범위를 정해 반복을 수행 : 범위형 반복문
 *
 */
fun main() {
    var a = 0

    //증가연산자 ++a a++ 변수의 값을 1즈가시켜주는 역할을 합니다.
    while (a < 5) {
        println(a++)
    }

    //전위 연산자 prefix operator : 전위 연산자는 연산자가 포함된 구문에서 이미 증감된 수를 반영하여 연산이 진행
    //후위 연산자 증가나 감소된 수를 해당 구문에서 사용하지 않고 '다음구문' 부터 사용한다

    //범위형 반복문
    //증가값을 1이 아닌 다른값으로 할경우 : step
    for (i in 0..9 step 3) {
        print(i)
    }

    //감소 downTo
    for (i in 9 downTo 0) {
        print(i)
    }

    //char
    for (c in 'a'..'z') {
        print(c)
    }

}