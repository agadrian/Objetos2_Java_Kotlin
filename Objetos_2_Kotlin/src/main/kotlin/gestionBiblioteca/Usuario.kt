package gestionBiblioteca

data class Usuario (
    val nombre: String,
    val prestamos: MutableList<Libro>
)
