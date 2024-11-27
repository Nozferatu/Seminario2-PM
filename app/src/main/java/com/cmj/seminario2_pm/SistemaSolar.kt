package com.cmj.seminario2_pm

class SistemaSolar (var planetas: MutableList<Planeta> = mutableListOf()){
    fun planetaMayor(): Planeta?{
        return planetas.maxByOrNull { it.masa }
    }

    fun masaMedia(): Float{
        var media = 0F
        var cantidad = planetas.size

        for(planeta in planetas){
            media += planeta.masa
        }

        return media / cantidad
    }
}