package gestionEstudiantes

data class Curso(
    val nombre: String,
    val alumnos: MutableList<Estudiante> = mutableListOf()
)