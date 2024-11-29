package com.cmj.seminario2_pm

class Guerrero(
    override var nombre: String,
    override var pv: Float,
    override var pm: Float,
    override var lvl: Int
) : PNJ("Guerrero", 0f, 0f, 1) {
    override fun levelUp() {
        super.levelUp()
        pv *= 1.08f
        pm *= 1.01f
    }

    override fun toString(): String {
        return "Guerrero(nombre='$nombre', pv=$pv, pm=$pm, lvl=$lvl)"
    }
}