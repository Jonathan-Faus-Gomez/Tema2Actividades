package com.example.tema2actividades

import java.text.DecimalFormat
import java.util.Scanner

fun main() {
    val scanner= Scanner(System.`in`)
    println("Introduce el peso de 3 personas")
    println("Peso de la persona 1:")
    val peso1: Float=scanner.nextFloat()
    println("Peso de la persona 2:")
    val peso2: Float=scanner.nextFloat()
    println("Peso de la persona 3:")
    val peso3: Float=scanner.nextFloat()

    val pesoMedio=(peso1+peso2+peso3)/3
    println("El peso medio de las 3 personas es de $pesoMedio")

    val redondear = DecimalFormat("#.##")
    val pesoMedioRedondeado = redondear.format(pesoMedio)

    println("El peso medio redondeado de las 3 personas es de $pesoMedioRedondeado")





}