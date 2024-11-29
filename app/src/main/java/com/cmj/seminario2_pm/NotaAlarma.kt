package com.cmj.seminario2_pm

import java.util.Date

class NotaAlarma(
    override var id: Int,
    override var linea: String,
    var hora: Date

): Nota(1, "") {
    override fun toString(): String {
        return "NotaAlarma(id=$id, linea='$linea', hora=$hora)"
    }
}