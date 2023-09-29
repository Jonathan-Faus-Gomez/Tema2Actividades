package com.example.tema2actividades.Actividad17

open class Libro (
    private val titulo: String,
    private val autor :String,
    private val any:Int,
    private val precio: Double) {
    override fun toString(): String {
        return "Titulo: $titulo\n Autor: $autor\n Año: $any\n Precio: $precio\n"
    }
    open fun calcularPrecioDescuento():Double{
        return precio-precio*0.10
    }
    fun getTitulo():String{
        return titulo
    }
    fun getPrecio():Double{
        return precio
    }
}