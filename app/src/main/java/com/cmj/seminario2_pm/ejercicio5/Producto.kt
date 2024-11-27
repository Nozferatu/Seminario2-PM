package com.cmj.seminario2_pm.ejercicio5

class Producto(
    var nombre: String,
    var precio: Float,
    var cantidadStock: Int
) {
    constructor() : this("Producto", 0F, 0)
}