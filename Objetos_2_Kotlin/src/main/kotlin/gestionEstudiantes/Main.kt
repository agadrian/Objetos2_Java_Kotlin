package org.example.gestionEstudiantes

import gestionEstudiantes.Curso
import gestionEstudiantes.Estudiante
import gestionEstudiantes.Profesor

fun main() {

    val profesor = Profesor("Pedro")
    val curso1 = Curso("2º Bachillerato")
    val estudiante1 = Estudiante(
        "Adri",
        mutableMapOf(
            "Matematicas" to 8.5,
            "Ingles" to 9.0,
            "Aleman" to 7.9,
            "Lengua" to 8.9
        )
    )

    val estudiante2 = Estudiante(
        "Juan",
        mutableMapOf(
            "Matematicas" to 3.5,
            "Ingles" to 7.0,
            "Aleman" to 2.9,
            "Lengua" to 4.9
        )
    )

    profesor.asignarCurso(curso1, estudiante1)
    profesor.calcularMedia(estudiante1)

    profesor.asignarCurso(curso1, estudiante2)
    profesor.calcularMedia(estudiante2)



}