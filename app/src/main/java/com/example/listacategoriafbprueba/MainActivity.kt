package com.example.listacategoriafbprueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.listacategoriafbprueba.modelo.conexiones.BDFireBase
import com.example.listacategoriafbprueba.modelo.daos.categorias.DaoCategoriasFB
import com.example.listacategoriafbprueba.modelo.daos.tareasItems.DaoTareasFB
import com.example.listacategoriafbprueba.modelo.entidades.Categoria
import com.example.listacategoriafirebase.modelo.entidades.Tarea

class MainActivity : AppCompatActivity() {
    lateinit var daoCategoria: DaoCategoriasFB
    lateinit var daoTarea: DaoTareasFB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val conexion = BDFireBase(this)

        daoCategoria = DaoCategoriasFB()
        daoTarea = DaoTareasFB()
        daoCategoria.createConexion(conexion)
        daoTarea.createConexion(conexion)

        pruebas1()
        //pruebas2()
    }

    fun pruebas1() {

        Log.d("pruebas", " *** Añado categorias: hogar y viajes ***")
        var hogar = Categoria("estudiar2")
        daoCategoria.addCategoria(hogar)
        var viajes = Categoria("Ir al Rocio2")
        daoCategoria.addCategoria(viajes)

        Log.d("pruebas", " *** Veo categorias añadidas ***")
        val muestraCategorias1: List<Categoria> = daoCategoria.getCategorias()
        muestraCategorias1.forEach {
            Log.d("pruebas", it.nombre)
        }

        Log.d("pruebas", " *** Obtengo Categoria Hogar *** ")
        val obtHogar: Categoria = daoCategoria.getCategoria("estudiar2")
        Log.d("pruebas", obtHogar.toString())
/*
        Log.d("pruebas", " *** Añado tareas a la categoria Hogar *** ")
        var cocina = Tarea( daoCategoria.getCategoria("Hogar").idCategoria,"Cocina")
        daoTarea.addTarea(cocina)
        var aseo = Tarea( daoCategoria.getCategoria("Hogar").idCategoria,"Aseo")
        daoTarea.addTarea(aseo)
        val tareasHogar1: List<Tarea> = daoTarea.getTareas(daoCategoria.getCategoria("Hogar").idCategoria)
        tareasHogar1.forEach {
            Log.d("pruebas", it.nombre)
        }
        Log.d("pruebas", " *** Obtengo Tarea Cocina *** ")
        val obtCocina: Tarea = daoTarea.getTarea("Cocina")
        Log.d("pruebas", obtCocina.toString())
*/
    }
//    private fun pruebas2() {
//        fun pruebas() {
//            Log.d("pruebas", " *** Añado categorias: hogar y viajes ***")
//            var hogar = Categoria("Hogar")
//            daoCategoria.addCategoria(hogar, { hogarId ->
//                Log.d("pruebas", " *** Categoria Hogar creada con ID: $hogarId ***")
//
//                Log.d("pruebas", " *** Añado tareas a la categoria Hogar *** ")
//                var cocina = Tarea(hogarId, "Cocina")
//                daoTarea.addTarea(cocina)
//                var aseo = Tarea(hogarId, "Aseo")
//                daoTarea.addTarea(aseo)
//
//                val tareasHogar1: List<Tarea> = daoTarea.getTareas(hogarId)
//                tareasHogar1.forEach {
//                    Log.d("pruebas", it.nombre)
//                }
//
//                Log.d("pruebas", " *** Obtengo Tarea Cocina *** ")
//                val obtCocina: Tarea = daoTarea.getTarea("Cocina")
//                Log.d("pruebas", obtCocina.toString())
//            }, { e ->
//                Log.e("pruebas", "Error al crear categoria Hogar", e)
//            })
//
//            var viajes = Categoria("Viajes")
//            daoCategoria.addCategoria(viajes, { viajesId ->
//                Log.d("pruebas", " *** Categoria Viajes creada con ID: $viajesId ***")
//            }, { e ->
//                Log.e("pruebas", "Error al crear categoria Viajes", e)
//            })
//
//            Log.d("pruebas", " *** Veo categorias añadidas ***")
//            val muestraCategorias1: List<Categoria> = daoCategoria.getCategorias()
//            muestraCategorias1.forEach {
//                Log.d("pruebas", it.nombre)
//            }
//
//            Log.d("pruebas", " *** Obtengo Categoria Hogar *** ")
//            val obtHogar: Categoria = daoCategoria.getCategoria("Hogar")
//            Log.d("pruebas", obtHogar.toString())
//        }
//    }
}