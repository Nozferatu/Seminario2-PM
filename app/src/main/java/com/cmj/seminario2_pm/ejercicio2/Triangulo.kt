package com.cmj.seminario2_pm.ejercicio2

import kotlin.math.pow

class Triangulo {
    var lados: MutableList<Double>
    var perimetro: Double
    var tipoTriangulo: String

    constructor(ladoA: Double, ladoB:Double, ladoC: Double, tipoTriangulo: String){
        this.lados = mutableListOf(ladoA, ladoB, ladoC)
        this.perimetro = lados.sum()

        var auxTipo = tipoTriangulo.lowercase()
        if(!auxTipo.equals("equilátero") && !auxTipo.equals("isósceles") && !auxTipo.equals("escaleno")){
            println("El tipo del triángulo proporcionado no es válido. Se le asignará.")
            this.tipoTriangulo = "Equilátero"
        }else{
            this.tipoTriangulo = tipoTriangulo
        }
    }

    fun rectangulo(): Boolean{
        var ladoLargo = lados.maxOrNull()
        var catetos:MutableList<Double> = lados
        catetos.remove(ladoLargo)

        if (ladoLargo != null) {
            return catetos[0].pow(2) + catetos[1].pow(2) == ladoLargo.pow(2)
        }

        return false
    }

    override fun toString(): String {
        return "Triangulo(lados=$lados, perimetro=$perimetro, tipoTriangulo='$tipoTriangulo')"
    }
}