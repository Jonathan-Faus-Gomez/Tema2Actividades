package com.example.tema2actividades

fun main() {

   println("Suma: "+suma(1,2,5,45,7,12))
}
fun suma(vararg numeros: Int):Int {
    var suma=0;
    for (numero in numeros) {
        suma += numero
    }
    return suma
}