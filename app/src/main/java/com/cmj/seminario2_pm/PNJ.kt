package com.cmj.seminario2_pm

open class PNJ (
    open var nombre: String,
    open var pv: Float,
    open var pm: Float,
    open var lvl: Int
){
    constructor(): this("PNJ", 0f, 0f, 1)

    open fun levelUp(){
        lvl++
    }

    override fun toString(): String {
        return "PNJ(nombre='$nombre', pv=$pv, pm=$pm, lvl=$lvl)"
    }
}