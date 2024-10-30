package gestionEstudiantes

data class Estudiante(
    val nombre: String,
    val asignaturas: MutableMap<String, Double>
)

