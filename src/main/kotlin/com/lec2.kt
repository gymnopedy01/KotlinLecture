package com

/**
 *
 */
fun main() {

//    var a: Int? = 123

    //nullable 선언
    var a: Int? = null
    a = 123

    var intValue:Int = 1234
    var longValue:Long = 1234L
    var intValueByHex:Int = 0x1af
    var intValueByBin:Int = 0b10110110

    var doubleValue:Double = 123.5
    var doubleValueWithExp:Double = 123.5e10
    var floatValue:Float  = 123.5f

    var charValue:Char = 'a'
    var koreanCharValue:Char = '가'

    val stringValue = "one line string test"

    val multiLineStringValue = """multiline
    string
    test"""""


    println(a)



}