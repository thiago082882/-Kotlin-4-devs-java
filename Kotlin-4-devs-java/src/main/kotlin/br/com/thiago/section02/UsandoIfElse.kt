package br.com.thiago.section02

fun main(){


    val nyInt = 199
    val aInt  : Int = 7

    val lowest  = if (nyInt < aInt) nyInt else aInt

    val temp = 26
    val isAirConditionerOn = if (temp >= 26){
        println("It is warn")
        true
    }else {
        println("It is not so warn")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")
}