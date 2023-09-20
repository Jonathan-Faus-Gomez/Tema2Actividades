package com.example.tema2actividades

import java.util.Scanner

fun main() {
    val scanner= Scanner(System.`in`)
    val array1: Array<Int> = Array(4){0}
    val array2: Array<Int> = Array(4){0}
    val resultado: Array<Int> = Array(4){0}
    println("Introduce 4 números")
    array1[0]=scanner.nextInt()
    array1[1]=scanner.nextInt()
    array1[2]=scanner.nextInt()
    array1[3]=scanner.nextInt()
    println("Introduce otros 4 números")
    array2[0]=scanner.nextInt()
    array2[1]=scanner.nextInt()
    array2[2]=scanner.nextInt()
    array2[3]=scanner.nextInt()

    for(i in 0..3){
        resultado[i]=array1[i]+array2[i]
    }
    for(i in 0..3){
        println("${array1[i]} + ${array2[i]} = ${resultado[i]}")
    }

}