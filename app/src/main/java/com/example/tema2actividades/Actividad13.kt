package com.example.tema2actividades

fun main() {
    val numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6 , 7, 8, 9, 10)
    println("¿Está ordenado?")
    println(ordenado(numeros))

}
fun ordenado( numeros: Array <Int>):Boolean{
    for (i in 1 .. 9){
        if (numeros[i]<numeros[i-1]){
            return false
        }
    }
    return true
}