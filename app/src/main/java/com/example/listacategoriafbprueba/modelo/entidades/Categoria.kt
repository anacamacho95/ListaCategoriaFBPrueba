package com.example.listacategoriafbprueba.modelo.entidades

import com.example.listacategoriafirebase.modelo.entidades.Tarea


class Categoria (var nombre: String) {
    //Una categoria tiene muchas tareas
    var tareas: MutableList<Tarea> = mutableListOf()

    var idCategoria: String=""

    // Constructor sin argumentos necesario para Firestore
    constructor() : this("")

    override fun toString(): String {
        return "Categoria(nombre='$nombre')"
    }
}