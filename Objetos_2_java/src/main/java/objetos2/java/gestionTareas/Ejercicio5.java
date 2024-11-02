package objetos2.java.gestionTareas;

public class Ejercicio5 {
    public static void ejercicioGestionTareas(){
        System.out.println("** Ejercicio gestion de tareas **");

        Usuario usuario1 = new Usuario("Adri");
        Tarea tarea1 = new Tarea("Crear menu app", "Menu ADA");
        Tarea tarea2 = new Tarea("Crear login", "Login ADA");

        Proyecto proyecto = usuario1.crearProyecto("Proyecto ADA");

        if (proyecto != null){
            proyecto.agregarTarea(tarea1);
            proyecto.agregarTarea(tarea2);

            proyecto.completarTarea(tarea1);

            proyecto.agregarTarea(tarea2);

            proyecto.mostrarTareasSinCompletar();
        }

    }
}
