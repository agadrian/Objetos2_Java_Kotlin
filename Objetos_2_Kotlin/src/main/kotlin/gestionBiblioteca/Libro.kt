package gestionBiblioteca

import java.util.UUID

data class Libro(
    val titulo: String,
    val autor: String,
    var prestado: Boolean = false,
    val isbn: UUID = UUID.randomUUID()

){
    override fun toString(): String {
        return "Titulo: $titulo, Autor: $autor, isbn: $isbn"
    }
}
