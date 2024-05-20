package com.example.listacategoriafirebase.modelo.entidades


class Tarea(var idCategoria: String, var nombre: String ) {

    //una tarea tiene un conjunto de items
    //var items: MutableList<Item> = mutableListOf()

    var idTarea: String=""

    // Constructor sin argumentos necesario para Firestore
    constructor() : this("", "")

    override fun toString(): String {
        return "Tarea(nombre='$nombre')"
    }
}