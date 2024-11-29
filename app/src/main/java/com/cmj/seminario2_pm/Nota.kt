package com.cmj.seminario2_pm

open class Nota(
    open var id: Int,
    open var linea: String
) {
    override fun toString(): String {
        return "Nota(id=$id, linea='$linea')"
    }
}