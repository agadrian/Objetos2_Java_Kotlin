package juegoRol

fun main(args: Array<String>) {

    val guerrero = Guerrero("G1", 100, 10)
    val mago = Mago("Oz", 100, 50)

    val bolaFuego = Hechizo("Bola de fuego", 25, 25)

    guerrero.atacar(mago)
    mago.atacar(guerrero)
    mago.lanzarHechizo(bolaFuego,guerrero)
    guerrero.atacar(mago)
    guerrero.atacar(mago)
    guerrero.atacar(mago)
    guerrero.atacar(mago)
    guerrero.atacar(mago)
    guerrero.atacar(mago)
    guerrero.atacar(mago)
    guerrero.atacar(mago)
    guerrero.atacar(mago)

}