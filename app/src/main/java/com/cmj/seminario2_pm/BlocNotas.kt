package com.cmj.seminario2_pm

class BlocNotas(
    var listaNotas: MutableList<Nota>
) {
    fun introducirNotas(nota: Nota){ listaNotas.add(nota) }

    fun eliminarNota(indice: Int){
        if(indice in listaNotas.indices){
            listaNotas.removeAt(indice)
        }
    }

    fun listarNotas(){
        for(nota in listaNotas){
            println(nota)
        }
    }

    fun cantidadNotas():Int { return listaNotas.size }
}