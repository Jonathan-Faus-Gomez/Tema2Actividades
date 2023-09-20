package com.example.tema2actividades

import java.util.Scanner

fun main() {
    val scanner= Scanner(System.`in`)
    println("Introduce 2 claves por teclado:")
    val clave1=scanner.nextLine()
    val clave2=scanner.nextLine()
    if(clave1.equals(clave2)) println("Son iguales")
    else println("Son distintas")
}