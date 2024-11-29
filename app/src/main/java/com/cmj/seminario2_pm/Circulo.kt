package com.cmj.seminario2_pm

import kotlin.math.pow

class Circulo(
    override var radio: Double,
    var color: String,
    override var posicionCentro: Array<Int>,
    override var puntoCualquiera: Array<Int>
): Circunferencia(0.0) {
    constructor(radio: Double, color: String) : this(radio, color, arrayOf(0, 0), arrayOf(0, 0))

    constructor(posicionCentro: Array<Int>, puntoCualquiera: Array<Int>, color: String) : this(0.0, color, posicionCentro, puntoCualquiera)

    fun area(): Double{ return radio.pow(2) * Math.PI}

    override fun toString(): String {
        return "Circulo(radio=$radio, color='$color', posicionCentro=${posicionCentro.contentToString()}, puntoCualquiera=${puntoCualquiera.contentToString()})"
    }
}