package com.example.tema2actividades

import java.util.Scanner

fun main() {
    println("PRODUCTO")
    producto()

    println("CUADRADO")
    cuadrado(5)
}
fun producto(){
    val scanner= Scanner(System.`in`)
    println("Introduce 2 valores")
    val n1=scanner.nextInt()
    val n2=scanner.nextInt()
    println("$n1 x $n2 = ${n1*n2}")
}
fun cuadrado(numero:Int){
    println("$numero= "+numero*numero)
}