package com.cmj.seminario2_pm.ejercicio4

class Estudiante (
    var nombre: String,
    var edad: Int,
    var calificaciones: MutableList<Float>
) {
    constructor() : this("Nombre por defecto", 0, mutableListOf())

    override fun toString(): String {
        return "Estudiante(nombre='$nombre', edad=$edad, calificaciones=$calificaciones)"
    }
}