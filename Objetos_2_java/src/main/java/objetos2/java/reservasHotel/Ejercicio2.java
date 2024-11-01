package objetos2.java.reservasHotel;

public class Ejercicio2 {

    public static void ejercicioReservasHotel() {
        System.out.println("\n** Ejercicio reservas hotel **");

        Habitacion hab1 = new Habitacion("12");
        Cliente cliente1 = new Cliente("Patricia");
        Cliente cliente2 = new Cliente("Mario");


        GestionReservas gestionReservas = new GestionReservas();

        gestionReservas.mostrarReservas();

        gestionReservas.agregarHabitacion(hab1);
        gestionReservas.mostrarHabsDispo();
        gestionReservas.reservarHabitacion(cliente1, hab1);
        gestionReservas.reservarHabitacion(cliente1, hab1);
        gestionReservas.mostrarHabsDispo();
        gestionReservas.mostrarReservas();
        gestionReservas.cancelarHabitacion(cliente2, hab1);
        gestionReservas.cancelarHabitacion(cliente1, hab1);
    }
}
