package objetos2.java.gestionEstudiantes;

import java.util.*;

public class Estudiante {
    String nombre;
    Map<String, Double> asignaturas;

    public Estudiante(String nombre, Map<String, Double> asignaturas) {
        this.nombre = nombre;
        this.asignaturas = new HashMap<>(asignaturas);
    }
}
