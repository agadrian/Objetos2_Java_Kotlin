package reservasHotel

import java.time.Instant
import java.util.Date

data class Reserva(
    val habitacion: Habitacion,
    val cliente: Cliente,
    val fechaReserva: Date = Date.from(Instant.now())
    )