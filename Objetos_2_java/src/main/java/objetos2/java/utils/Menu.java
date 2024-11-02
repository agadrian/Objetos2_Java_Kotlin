package objetos2.java.utils;

import java.util.Scanner;
import objetos2.java.gestionBiblioteca.Ejercicio1;
import objetos2.java.reservasHotel.Ejercicio2;
import objetos2.java.juegoRol.Ejercicio3;
import objetos2.java.gestionEstudiantes.Ejercicio4;
import objetos2.java.gestionTareas.Ejercicio5;

/**
 * Clase que representa el menú principal de la aplicación.
 */
public class Menu {
    Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Función interna para pedir una opción dentro de un rango específico.
     * @param min El valor mínimo permitido.
     * @param max El valor máximo permitido.
     * @return La opción seleccionada por el usuario.
     */
    private int pedirOpcion(int min, int max) {
        int opcion = -1;

        do {
            System.out.print("Introduce opción -> ");
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida.");
                opcion = -1;
            }

            if (opcion < min || opcion > max) {
                System.out.println("Opción fuera de rango.");
            }
        } while (opcion < min || opcion > max);

        return opcion;
    }

    /**
     * Función que muestra y gestiona el menú principal.
     */
    public void menuPrincipal() {
        int opc;

        do {
            imprimirMenuPrincipal();
            opc = pedirOpcion(1, 6);

            switch (opc) {
                case 1 -> Ejercicio1.ejercicioGestionBiblioteca();
                case 2 -> Ejercicio2.ejercicioReservasHotel();
                case 3 -> Ejercicio3.juegoRPG();
                case 4 -> Ejercicio4.ejercicioGestionEstudiantes();
                case 5 -> Ejercicio5.ejercicioGestionTareas();
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no válida."); // En caso de error
            }
        } while (opc != 6);
    }

    /**
     * Función interna para imprimir las opciones del menú principal.
     */
    private void imprimirMenuPrincipal() {
        System.out.println("\n\nEjercicios 1-5 (6 para Salir)");
    }
}
