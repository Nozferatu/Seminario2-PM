package com.cmj.seminario2_pm

class Prueba {
    var blocNotas = BlocNotas()

    fun realizarPruebas(){
        blocNotas.introducirNotas(Nota(1, "ola ke ase"))
        blocNotas.introducirNotas(Nota(2, "adio no vemo"))
        blocNotas.listarNotas()
        blocNotas.eliminarNota(0)
        blocNotas.cantidadNotas()
    }
}