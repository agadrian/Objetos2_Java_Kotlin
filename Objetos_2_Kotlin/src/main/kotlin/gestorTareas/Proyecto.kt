package gestorTareas

class Proyecto(
    val nombre: String
) {

    private val tareas = mutableListOf<Tarea>()

    fun agregarTarea(tarea: Tarea) {
        if (!tareas.contains(tarea)) {
            tareas.add(tarea)
            println("Tarea '${tarea.nombre}' añadida al proyecto '$nombre' correctamente")
        }else{
            println("La tarea '${tarea.nombre}' ya pertenece al proyecto '$nombre'.")
        }
    }


    fun completarTarea(tarea: Tarea) {
        if (tareas.contains(tarea) && !tarea.completada) {
            tareas.remove(tarea)
            tarea.completada = true
            println("Tarea '${tarea.nombre}' marcada como completada en el proyecto '$nombre'")
        }else{
            println("Esta tarea no pertenece al proyecto o ya estaba compeltada")
        }
    }

    fun mostrarTareasSinCompletar(){
        if (tareas.size > 0){
            println("Lista tareas sin completar: ")
            tareas.forEach{
                println(it)
            }
        }

    }
}