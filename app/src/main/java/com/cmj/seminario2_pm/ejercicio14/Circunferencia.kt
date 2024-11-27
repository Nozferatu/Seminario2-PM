package com.cmj.seminario2_pm.ejercicio14

open class Circunferencia(
    var radio: Double
) {
    var posicionCentro: Array<Int> = arrayOf(0, 0)
    var puntoCualquiera: Array<Int> = arrayOf(0, 0)

    constructor(posicionCentro: Array<Int>, puntoCualquiera: Array<Int>) : this(0.0){
        this.posicionCentro = posicionCentro
        this.puntoCualquiera = puntoCualquiera
    }

    fun longitud(): Double{ return radio * 2 * Math.PI }

    override fun toString(): String {
        return "Circunferencia(radio=$radio, posicionCentro=$posicionCentro, puntoCualquiera=$puntoCualquiera)"
    }
}