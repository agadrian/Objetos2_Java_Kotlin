package utils

import gestionBiblioteca.ejercicioGestionBiblioteca as ej1
import gestionEstudiantes.ejercicioGestionEstudiantes as ej2
import gestorTareas.ejercicioGestorTareas as ej3
import juegoRol.ejercicioJuegoRol as ej4
import reservasHotel.ejercicioReservasHotel as ej5

/**
 * Clase que representa el menú principal de la aplicación.
 */
class Menu() {

    /**
     * Función interna para pedir una opción dentro de un rango específico.
     * @param min El valor mínimo permitido.
     * @param max El valor máximo permitido.
     * @return La opción seleccionada por el usuario.
     */
    private fun pedirOpcion(min: Int, max: Int): Int {
        var opcion: Int

        do {
            print("Introduce opción -> ")
            opcion = readln().toIntOrNull() ?: -1

            if (opcion == -1) {
                println("Opción no válida. ")
            } else if (opcion !in min..max) {
                println("Opción fuera de rango. ")
            }
        } while (opcion !in min..max)
        return opcion
    }


    /**
     * Función que muestra y gestiona el menú principal.
     */
    fun menuPrincipal() {

        var opc: Int
        do {
            imprimirMenuPrincipal()
            opc = pedirOpcion(1, 6)

            when (opc) {
                1 -> ej1()
                2 -> ej2()
                3 -> ej3()
                4 -> ej4()
                5 -> ej5()
                6 -> println("Saliendo del programa...")
            }
        } while (opc != 6)
    }

    /**
     * Función interna para imprimir las opciones del menú principal.
     */
    private fun imprimirMenuPrincipal() {
        println("\nMenu ejercicios:\nEjercicios 1-5 (6 para Salir)")
    }


}


