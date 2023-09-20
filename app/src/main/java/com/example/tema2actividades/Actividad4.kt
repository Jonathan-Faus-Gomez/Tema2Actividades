package com.example.tema2actividades

import java.util.Scanner

fun main() {
    val scanner= Scanner(System.`in`)
    println("Introduce el precio del artículo")
    val articulo=scanner.nextFloat()
    println("Introduce la cantidad de artículos")
    val cantidad=scanner.nextInt()

    println("Total: ${articulo*cantidad} euros")


}