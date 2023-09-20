package com.example.tema2actividades

import java.util.Scanner

fun main() {
    val scanner= Scanner(System.`in`)
    println("Introduce 3 numeros")
    val n1=scanner.nextInt()
    val n2=scanner.nextInt()
    val n3=scanner.nextInt()
    ordenar(n1,n2,n3)
}
fun ordenar(n1: Int, n2:Int, n3:Int){
    if(n1<n2 && n1<n3){
        if(n2<n3) println("$n1<$n2<$n3")
        else println("$n1<$n3<$n2")
    }else if(n2<n3 && n2<n1){
        if(n1<n3) println("$n2<$n1<$n3")
        else println("$n2<$n3<$n1")
    } else{
        if(n1<n2) println("$n3<$n1<$n2")
        else println("$n3<$n2<$n1")
    }
}