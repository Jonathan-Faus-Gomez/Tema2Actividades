package com.example.tema2actividades

import java.text.DecimalFormat
import java.util.Scanner

fun main() {
    val peso1= 55.2f
    val peso2= 102.2f
    val peso3= 80.97f

    val pesoMedio=(peso1+peso2+peso3)/3
    println("El peso medio de las 3 personas es de $pesoMedio")

    val redondear = DecimalFormat("#.##") // val promedioRedondeado= Math.round(pesoMedio *100.0)/100.0
    val pesoMedioRedondeado = redondear.format(pesoMedio)

    println("El peso medio redondeado de las 3 personas es de $pesoMedioRedondeado")





}