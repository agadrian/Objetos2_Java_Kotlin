package objetos2.java.gestionTareas;

public class Tarea {
    String nombre;
    String descripcion;
    Boolean completada;

    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completada = false;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + ", Descripcion: " + descripcion);
    }
}
