package gestionEstudiantes

class Profesor(
    val nombre: String
) {

    fun asignarCurso(curso: Curso, estudiante: Estudiante) {
        if (!curso.alumnos.contains(estudiante)){
            curso.alumnos.add(estudiante)
            println("Estudiante añadido al curso correctamente.")
        }else{
            println("Este estudiante ya pertenece al curso.")
        }
    }

    fun calcularMedia(estudiante: Estudiante){
        val media = estudiante.asignaturas.values.average()

        println("Media de las notas de ${estudiante.nombre}: ${"%.2f".format(media)}")
    }
}