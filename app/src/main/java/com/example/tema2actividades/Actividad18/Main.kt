package com.example.tema2actividades.Actividad18

import java.util.Scanner

fun main() {
    val listaTareas = mutableListOf<Tarea>()

}
fun agregarTarea(listaTareas: MutableList<Tarea>, nuevaTarea: Tarea) {
    listaTareas.add(nuevaTarea)
}
fun modificarTarea(listaTareas: MutableList<Tarea>, nombreModificar: String, nuevaDescripcion: String, nuevaPrioridad: Prioridad, nuevaCompletada: Boolean) {
    val scanner= Scanner(System.`in`)
    val tareaMod= listaTareas.find { it.nombre==nombreModificar }
    if (tareaMod != null) {
        tareaMod.descripcion = nuevaDescripcion
        tareaMod.prioridad = nuevaPrioridad
        tareaMod.completada = nuevaCompletada
    } else {
        println("Tarea no encontrada: $nombreModificar")
    }
}
fun listarTareasPorPrioridad(listaTareas: List<Tarea>, prioridadFiltrar: Prioridad): List<Tarea> {
    return listaTareas.filter { it.prioridad == prioridadFiltrar }
}