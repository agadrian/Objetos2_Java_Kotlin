package org.example.gestionBiblioteca

import gestionBiblioteca.Biblioteca
import gestionBiblioteca.Libro
import gestionBiblioteca.Usuario

fun main(args: Array<String>) {
    val user1 = Usuario("Adri", mutableListOf())
    val user2 = Usuario("Juan", mutableListOf())

    val libro1 = Libro("Harry Poter", "Yo")
    val libro2 = Libro("Alvin", "ardillas")
    val biblioteca = Biblioteca()

    biblioteca.agregarLibro(libro1)
    biblioteca.registrarUsuario(user1)
    biblioteca.registrarUsuario(user2)
    biblioteca.prestarLibro(libro1, user1)
    biblioteca.prestarLibro(libro2, user2)

    biblioteca.devolverLibro(libro1,user2)
    biblioteca.devolverLibro(libro1,user1)
    biblioteca.devolverLibro(libro2,user2)

    biblioteca.prestarLibro(libro2, user1)


    biblioteca.mostrarInfoUsersLibros()
}