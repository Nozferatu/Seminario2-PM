package com.cmj.seminario2_pm

class EquipoFutbol(
    var nombre: String,
    var pais: String
) {
    constructor() : this("Equipo", "Pais")

    override fun toString(): String {
        return "EquipoFutbol(nombre='$nombre', pais='$pais')"
    }
}