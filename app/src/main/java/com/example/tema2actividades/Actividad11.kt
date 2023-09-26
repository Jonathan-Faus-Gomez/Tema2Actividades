package com.example.tema2actividades

fun main() {

    println("Mayores de edad: "+ edades(18,15,32,45,6,14))
}


/*

fun edades(vararg numeros: Int):Int {
var contador=0
for (numero in numeros) {
if (numero>=18){
contador++
}
}
return contador
}


 */


fun edades(vararg edades: Int) = edades.count { it >=18 }