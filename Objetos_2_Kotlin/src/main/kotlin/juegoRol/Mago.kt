package juegoRol

class Mago(nombre: String, vida: Int, private var mana: Int): Personaje(nombre, vida) {

    fun lanzarHechizo(hechizo: Hechizo, objetivo: Personaje) {
        if (mana > hechizo.costeMana){
            mana -= hechizo.costeMana
            println("$nombre lanza ${hechizo.nombre} a ${objetivo.nombre} con un daño de ${hechizo.danio}. Mana restante: $mana")
            objetivo.recibirDanio(hechizo.danio)

        }else{
            println("$nombre no tiene suficiente mana para lanzar hechizo")
        }
    }

}