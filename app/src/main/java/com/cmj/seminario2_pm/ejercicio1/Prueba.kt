package com.cmj.seminario2_pm.ejercicio1

fun main(){
    var planeta1: Planeta = Planeta("Tierra", "lmao", 100F)
    println(planeta1)

    var planeta2: Planeta = Planeta()
    println(planeta2)

    var sistemaSolar: SistemaSolar = SistemaSolar(mutableListOf(planeta1, planeta2))
    println("Planeta con mayor masa: ${sistemaSolar.planetaMayor()}")

    println("Masa media de todos los planetas: ${sistemaSolar.masaMedia()}")
}