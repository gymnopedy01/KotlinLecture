/**scope 범위
 * 언어차워에서 변수나 함수, 클래스 같은 '멤버'들을
 * 서로 공유하여 사용할수 있는 범위를 지정해 둔 단위 입니다
 * 패키지 클래스 함수
*/
/**
 * 세가지 규칙
 * 1. 스코프 외부에서는 스코프 내부 의 멤버를 '참조연산자' 로만 참조가 가능합니다.
 *  ex) a.eat(), import com.google.dimo, com.google.dimo.A
 * 2. 동일 스코프 내에서는 멤버들을 '공유' 할 수 있습니다.
 * 3. 하위 스코프에서는 상위 스코프의 멤버를 재정의 할수 있습니다.
 *  원래 스코프의 같은 레벨에서는 같은 이름의 멤버를 만들어서는 안됩니다
 *
 * 접근제한자 access Modifier
 * 스코프외부에서 스코프 내부에 접근할 때 그권한을 '개발자가 제한할수 있는 기능'
 * ex)
 * private var a = "..."
 * public fun b{...}
 * internal class C{...}
 * 패키지 스코프 에서는
 * public(기본값) 어떤 패키지 에서도 접근가능
 * internal 같은 모듈 내에서만 접근 가능
 * private 같은 파일 내에서만 접근 가능
 * 클래스 스코프 에서는
 * public(기본값) 클래스 외부에서 늘 접근 가능
 * private 클래스 내부에서만 접근 가능
 * protected 클래스 자신과 상속받은 클래스에서 접근 가능
 *
*/

val a = "패키지 스코프"

class B {
    val a = "클래스 스코프"
    fun print() {
        println(a)
    }
}

fun main() {
    val a = "함수 스코프"
    println(a)
    B().print()
}
