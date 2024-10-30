package juegoRol

open class Personaje(
    val nombre: String,
    var vida: Int,
    open val danioBase: Int = 10
) {

    open fun atacar(objetivo: Personaje) {

        if (objetivo.vida > 0) {
            print("$nombre ataca a ${objetivo.nombre} con un daño de $danioBase. ")
            objetivo.recibirDanio(danioBase)
        }else{
            println("${objetivo.nombre} ha sido eliminado")
        }
    }

    open fun recibirDanio(danio: Int){
        vida -= danio

        if (vida <= 0){
            vida = 0
        }else{
            println("$nombre tiene $vida de vida restante")
        }
    }
}