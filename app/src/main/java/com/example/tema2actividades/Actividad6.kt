package com.example.tema2actividades

import java.util.Scanner

fun menor(){
    val scanner= Scanner(System.`in`)
    println("Introduce 3 numeros")
    val n1=scanner.nextInt()
    val n2=scanner.nextInt()
    val n3=scanner.nextInt()
    if(n1<n2 && n1<n3){
        println("El menor es $n1")
    }else if(n2<n1 && n2<n3){
        println("El menor es $n2")
    } else{
        println("El menor es $n3")
    }

}
fun main() {
    menor()
    menor()
}