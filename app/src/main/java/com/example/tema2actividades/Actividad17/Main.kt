package com.example.tema2actividades.Actividad17

fun main() {
    val libro: Libro= Libro("Buenas","Paquito",2023,19.99)
    val libroDigital=LibroDigital("Heyyyyyyyy","Marcos",1914,1000.00,"DMV")

    println("Libro precio: ${libro.getPrecio()}, con descuento: ${libro.calcularPrecioDescuento()}")
    println("Libro precio: ${libroDigital.getPrecio()}, con descuento: ${libroDigital.calcularPrecioDescuento()}")
}