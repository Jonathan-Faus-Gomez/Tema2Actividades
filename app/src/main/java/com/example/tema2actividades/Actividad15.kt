package com.example.tema2actividades

import java.util.Scanner

fun main() {

    println("La suma es "+ suma(creacion()))
}
fun creacion():Array <Int>{
    val scanner= Scanner(System.`in`)
    println("De cuantos elementos quieres el array?")
    val cantidad=scanner.nextInt()
    val array: Array<Int> = Array(cantidad){0}
    for (i in 0 until cantidad){
        println("Introduce un número:")
        array[i]=scanner.nextInt()
    }
    return array
}
fun suma(array: Array <Int>):Int{
    var resultado=0;
    for (numero in array){
        resultado+=numero
    }
    return resultado
}