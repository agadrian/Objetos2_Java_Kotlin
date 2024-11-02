package objetos2.java.gestionEstudiantes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
    public static void ejercicioGestionEstudiantes() {
        System.out.println("** Ejercicio gestion estudiantes **");

        Profesor profesor = new Profesor("Pedro");
        Curso curso = new Curso("1º Bach");
        Map<String, Double> asignaturas = new HashMap<>();
        asignaturas.put("Ingles", 3.0);
        asignaturas.put("Aleman", 7.0);
        asignaturas.put("Mates", 5.0);
        asignaturas.put("Lengua", 9.0);

        Estudiante estudiante = new Estudiante("Adri", asignaturas);
        Estudiante estudiante2 = new Estudiante("Pedro", asignaturas);

        profesor.asignarCurso(curso, estudiante);
        profesor.calcularMedia(estudiante);
        //profesor.asignarCurso(curso, estudiante2);
        profesor.calcularMedia(estudiante2);


    }
}
