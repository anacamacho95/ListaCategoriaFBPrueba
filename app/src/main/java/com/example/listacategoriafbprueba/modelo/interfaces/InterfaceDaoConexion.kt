package com.example.listacategoriafirebase.modelo.interfaces

import com.example.listacategoriafbprueba.modelo.conexiones.BDFireBase

interface InterfaceDaoConexion {

    fun createConexion(con: BDFireBase)
}