package com.example.tema2actividades

import java.util.Scanner

fun main() {
    val scanner= Scanner(System.`in`)
    println("Introduce 4 números")
    val n1=scanner.nextInt()
    val n2=scanner.nextInt()
    val n3=scanner.nextInt()
    val n4=scanner.nextInt()
    println("$n1 + $n2= ${n1+n2}")
    println("$n3 x $n4= ${n3*n4}")


}