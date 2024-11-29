package com.cmj.seminario2_pm

class Mago(
    override var nombre: String,
    override var pv: Float,
    override var pm: Float,
    override var lvl: Int
) : PNJ("Mago", 0f, 0f, 1) {
    override fun levelUp() {
        super.levelUp()
        pv *= 1.04f
        pm *= 1.03f
    }

    override fun toString(): String {
        return "Mago(nombre='$nombre', pv=$pv, pm=$pm, lvl=$lvl)"
    }
}