package com.cmj.seminario2_pm.ejercicio3

class Contacto(var nombre: String,
               var telefono: Int,
               var email: String) {

    constructor() : this("Nombre por defecto", 0, "example@mail.com")

    override fun toString(): String {
        return "Contacto(nombre='$nombre', telefono=$telefono, email='$email')"
    }
}