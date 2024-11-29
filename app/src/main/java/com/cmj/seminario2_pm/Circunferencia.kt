package com.cmj.seminario2_pm

open class Circunferencia(
    open var radio: Double
) {
    open var posicionCentro: Array<Int> = arrayOf(0, 0)
    open var puntoCualquiera: Array<Int> = arrayOf(0, 0)

    constructor(posicionCentro: Array<Int>, puntoCualquiera: Array<Int>) : this(0.0){
        this.posicionCentro = posicionCentro
        this.puntoCualquiera = puntoCualquiera
    }

    fun longitud(): Double{ return radio * 2 * Math.PI }

    override fun toString(): String {
        return "Circunferencia(radio=$radio, posicionCentro=$posicionCentro, puntoCualquiera=$puntoCualquiera)"
    }
}