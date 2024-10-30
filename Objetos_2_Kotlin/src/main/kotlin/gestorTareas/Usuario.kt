package gestorTareas

class Usuario(
    val nombre: String
) {

    private val proyectos = mutableListOf<Proyecto>()

    fun crearProyecto(nombre: String): Proyecto? {
        val proyecto = Proyecto(nombre)

        if (!proyectos.contains(proyecto)) {
            proyectos.add(proyecto)
            println("Proyecto '${proyecto.nombre}' ha sido creado")
            return proyecto
        }else{
            println("Este nombre de proyecto ya ha sido creado")
        }

        return null
    }
}