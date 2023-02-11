package br.com.thiago.section07

fun main(){
    println("10 + 20 = ${myMathFunction(10,20)}")
    println("18 + 27 = ${myExpressionBodyFunction(18,27)}")
    println("18 + 27 = ${myExpressionBodyFunctionWithInference(18,27)}")
    println("10 + 7 = ${myFunctionWithDefault(10,7,"Hello")}")
    println("Defaul SUM = ${myFunctionWithDefault(message = "Hello")}")
}

fun myMathFunction(number1: Int,number2:Int) : Int {

    return number1 + number2

}

fun myExpressionBodyFunction(number1: Int,number2:Int) : Int = number1+ number2

fun myExpressionBodyFunctionWithInference(number1: Int,number2:Int) = number1+ number2


fun myFunctionWithDefault(number1: Int=1,number2:Int=2,message:String="Hi"): Int{
    val result = number1 + number2
    println(message)
    return result
}


