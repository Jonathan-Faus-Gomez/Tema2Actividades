package com.example.tema2actividades

import java.util.Scanner

fun main() {val scanner= Scanner(System.`in`)
    var contador0=0
    var contadorDiferentes=0
    println("Introduce 10 números")
    for (i in 1..10){
        when(scanner.nextInt()){
            0 ->{
                contador0++
            }
            else ->{
                contadorDiferentes++
            }
        }
    }
    println("Han habido $contador0 ceros")
    println("Han habido $contadorDiferentes números distintos")


}