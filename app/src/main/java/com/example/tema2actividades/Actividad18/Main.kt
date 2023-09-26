package com.example.tema2actividades.Actividad18

import java.util.Scanner

fun main() {
    val listaTareas = mutableListOf<Tarea>()

}
fun agregarTarea(listaTareas: MutableList<Tarea>, nuevaTarea: Tarea) {
    listaTareas.add(nuevaTarea)
}
fun modificarTarea(listaTareas: MutableList<Tarea>, nombreModificar: String) {
    val scanner= Scanner(System.`in`)
    val tareaMod= listaTareas.find { it.nombre==nombreModificar }
    if(tareaMod!=null){
        //
    }
}