package reservasHotel

data class Cliente(
    val nombre: String
){
    override fun toString(): String {
        return "Nombre: $nombre"
    }
}
