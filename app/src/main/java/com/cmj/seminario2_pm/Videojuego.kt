package com.cmj.seminario2_pm

class Videojuego(
    var nombre: String,
    var anio: Int,
    var plataforma: String
) {
    override fun toString(): String {
        return "Videojuego(nombre='$nombre', anio=$anio, plataforma='$plataforma')"
    }
}