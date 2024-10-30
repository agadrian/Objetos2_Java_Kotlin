package reservasHotel

class GestionReservas {

    private val habitaciones = mutableListOf<Habitacion>()
    private val reservas = mutableListOf<Reserva>()

    fun agregarHabitacion(habitacion: Habitacion) {
        if (!habitaciones.contains(habitacion)) {
            habitaciones.add(habitacion)
            println("Habitación número ${habitacion.numero} agregada correctamente.")
        }else{
            println("Ya existe esta habitación.")
        }
    }


    fun mostrarHabsDispo(){
        val habDispos = habitaciones.filter { !it.ocupada }

        if (habDispos.isNotEmpty()) {
            println("Habitaciones disponibles: ")
            habDispos.forEach { println(it)}
        }else{
            println("No hay habitaciones disponibles.")
        }
    }


    fun reservarHabitacion(cliente: Cliente, habitacion: Habitacion) {
        if (!habitacion.ocupada && habitaciones.contains(habitacion)) {
            val reserva = Reserva(habitacion, cliente)
            reservas.add(reserva)
            habitacion.ocupada = true
            println("Reserva de la habitación numero ${habitacion.numero} realizada correctamente por el cliente ${cliente.nombre}")
        }else{
            println("Habitación no disponible para reservar")
        }
    }


    fun cancelarHabitacion(cliente: Cliente, habitacion: Habitacion) {
        val reserva = reservas.find {it.cliente == cliente && it.habitacion == habitacion}

        if (reserva != null) {
            reservas.remove(reserva)
            habitacion.ocupada = false
            println("Reserva del cliente ${cliente.nombre} de la habitacion numero ${habitacion.numero} cancelada correctamente.")

        }else{
            println("No existe ninguna reserva para el cliente ${cliente.nombre} y numero de habitacion ${habitacion.numero}")
        }
    }

    fun mostrarReservas(){
        if (reservas.isNotEmpty()) {
            reservas.forEachIndexed { index, reserva ->
                println("Reserva ${index+1}.- Num habitacion: ${reserva.habitacion.numero}, Cliente: ${reserva.cliente.nombre}, Fecha reserva: ${reserva.fechaReserva}")
            }
        }else{
            println("No hay reservas actualmente.")
        }
    }
}