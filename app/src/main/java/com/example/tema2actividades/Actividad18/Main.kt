package com.example.tema2actividades.Actividad18

import java.util.Scanner

fun main() {

    val listaTareas: MutableList<Tarea> = mutableListOf<Tarea>().apply {
        add(Tarea("Comprar", "Ir al supermercado", Prioridad.ALTA, false))
        add(Tarea("Hacer ejercicio", "Correr", Prioridad.MEDIA, false))
        add(Tarea("Llamar", "Llamar a mi abuela", Prioridad.ALTA, false))
    }
    //añadir
    with(listaTareas){
        add(Tarea("Bailar","Bailar mucho",Prioridad.BAJA,false))
        add(Tarea("Comer","Comer sano",Prioridad.ALTA,false))
    }

    //modificar
    modificarTarea(listaTareas,"Comprar","Comprar un coche",Prioridad.MEDIA,true)

    println("Tareas con prioridad ALTA:")

        //listar
    for (tarea : Tarea in listarTareasPorPrioridad(listaTareas,Prioridad.ALTA) )
    {
        println(tarea.toString())
    }



}
fun agregarTarea(listaTareas: MutableList<Tarea>, nuevaTarea: Tarea) {
    listaTareas.add(nuevaTarea)
}
fun modificarTarea(listaTareas: MutableList<Tarea>, nombreModificar: String, nuevaDescripcion: String, nuevaPrioridad: Prioridad, nuevaCompletada: Boolean) {
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