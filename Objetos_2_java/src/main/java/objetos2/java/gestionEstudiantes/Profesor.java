package objetos2.java.gestionEstudiantes;

public class Profesor {
    String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public void asignarCurso(Curso curso, Estudiante estudiante) {
        if (!curso.estudiantes.contains(estudiante)) {
            curso.estudiantes.add(estudiante);
            System.out.println("Estudiante " + estudiante.nombre + " añadido al curso " + curso.nombre + " correctamente");
        }else{
            System.out.println("El estudiante " + estudiante.nombre + " ya pertenece al curso " + curso.nombre);
        }
    }

    public void calcularMedia(Estudiante estudiante) {
        Double media = estudiante.asignaturas.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.printf("La media de %s es: %.2f%n", estudiante.nombre, media);
    }
}
