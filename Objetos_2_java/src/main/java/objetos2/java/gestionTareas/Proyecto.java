package objetos2.java.gestionTareas;

import java.util.ArrayList;

public class Proyecto {
    String nombre;
    private final ArrayList<Tarea> tareas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        if (!this.tareas.contains(tarea)) {
            this.tareas.add(tarea);
            System.out.println("Tarea '"+ tarea.nombre + "' agregada correctamente al proyecto '"+ nombre + "'");
        }else{
            System.out.println("Error al añadir la tarea '"+ tarea.nombre + "'. Ya existe en el proyecto '" + nombre +"'");
        }
    }


    public void completarTarea(Tarea tarea) {
        if (tareas.contains(tarea) && !tarea.completada) {
            this.tareas.remove(tarea);
            tarea.completada = true;
            System.out.println("Tarea '" + tarea.nombre + "' marcada como completada en el proyectro "+ nombre);
        }else{
            System.out.println("Error al marcar la tarea como completada: la tarea '" + tarea.nombre + "' no pertenece al proyecto '" + nombre + "', o ya estaba completada.");
        }
    }


    public void mostrarTareasSinCompletar(){
        if (!tareas.isEmpty()) {
            System.out.println("Tareas pendientesMenu: ");
            for (Tarea tarea : tareas) {
                tarea.mostrarInfo();
            }
        }
    }
}
