package com.example.tema2actividades

fun main() {
    println("¿5>4?")
    println(5 esMayorQue 4)
}
infix fun Int.esMayorQue(numero: Int): Boolean {
     return (this > numero);
}