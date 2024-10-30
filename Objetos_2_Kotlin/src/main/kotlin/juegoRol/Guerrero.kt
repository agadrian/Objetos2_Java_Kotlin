package juegoRol

class Guerrero(nombre: String, vida: Int, private val danioExtra: Int) : Personaje(nombre, vida) {

    override val danioBase: Int
        get() = super.danioBase + danioExtra



}