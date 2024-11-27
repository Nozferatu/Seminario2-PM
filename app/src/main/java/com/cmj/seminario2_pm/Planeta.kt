package com.cmj.seminario2_pm

class Planeta {
    var nombre: String
    var tipo: String
    var masa: Float = 0F

    constructor(nombre: String, tipo: String, masa: Float) {
        this.nombre = nombre
        if(!tipo.lowercase().equals("rocoso") && !tipo.lowercase().equals("gaseoso")){
            println("El planeta $nombre se ha declarado con un tipo no válido. Se le asignará Rocoso por defecto")
            this.tipo = "Rocoso"
        }else{
            this.tipo = tipo
        }
        this.masa = masa
    }

    //constructor(nombre: String) : this(nombre, "Rocoso", 0F)

    constructor() : this("PlanetaDefault", "Rocoso", 0F)

    override fun toString(): String {
        return "Planeta(nombre='$nombre', tipo='$tipo', masa=$masa)"
    }
}