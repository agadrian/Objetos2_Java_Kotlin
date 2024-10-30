package gestorTareas

class Tarea(
    val nombre: String,
    private val descripcion: String,
    var completada: Boolean = false
) {
    override fun toString(): String {
        return "Nombre: $nombre, Descripcion: $descripcion, Completada: ${if (completada) "si" else "no"} )"
    }
}