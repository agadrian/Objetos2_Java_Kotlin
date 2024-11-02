package objetos2.java.gestionEstudiantes;

import java.util.ArrayList;

public class Curso {
    String nombre;
    ArrayList<Estudiante> estudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }
}
