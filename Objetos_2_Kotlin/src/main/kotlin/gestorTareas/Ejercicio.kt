package gestorTareas

fun ejercicioGestorTareas(){
    println("\n** Ejercicio gestor tareas **")

    val usuario1 = Usuario("Adri")
    val tarea1 = Tarea("Crear menu app", "Menu app ADA")
    val tarea2 = Tarea("Crear login", "Login ADA")

    val proyecto1 = usuario1.crearProyecto("PROYECTO ADA")

    if (proyecto1 != null) {
        proyecto1.agregarTarea(tarea1)
        proyecto1.agregarTarea(tarea2)

        proyecto1.completarTarea(tarea1)

        proyecto1.agregarTarea(tarea2)

        proyecto1.mostrarTareasSinCompletar()
    }
}