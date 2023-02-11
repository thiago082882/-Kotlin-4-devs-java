package br.com.thiago

fun main (args : Array<String>) {

    val  name  = if(args.isNotEmpty()) args[0] else "kotlin word"
    println("hello,$name !!!")
}