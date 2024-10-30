package reservasHotel

data class Habitacion(
    val numero: String,
    var ocupada: Boolean = false
){
    override fun toString(): String {
        return "Numero hab: $numero, Estado: ${if (ocupada) "Ocupada" else "Disponible"}"
    }
}
