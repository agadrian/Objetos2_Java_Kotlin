package org.example.reservasHotel

import reservasHotel.Cliente
import reservasHotel.GestionReservas
import reservasHotel.Habitacion

fun main(args: Array<String>) {

    val hab1 = Habitacion("12")
    val cliente1 = Cliente("Patricia")
    val cliente2 = Cliente("Mario")

    val gestionReservas = GestionReservas()

    gestionReservas.mostrarReservas()

    gestionReservas.agregarHabitacion(hab1)
    gestionReservas.mostrarHabsDispo()
    gestionReservas.reservarHabitacion(cliente1, hab1)
    gestionReservas.reservarHabitacion(cliente1, hab1)
    gestionReservas.mostrarHabsDispo()
    gestionReservas.mostrarReservas()
    gestionReservas.cancelarHabitacion(cliente2, hab1)
    gestionReservas.cancelarHabitacion(cliente1, hab1)

}