package com.example.tema2actividades.Actividad17

class LibroDigital(titulo: String, autor: String, any: Int, precio: Double, val formato: String): Libro(titulo, autor,any,precio) {
    override fun calcularPrecioDescuento():Double{
        return getPrecio()-getPrecio()*0.20
    }
}