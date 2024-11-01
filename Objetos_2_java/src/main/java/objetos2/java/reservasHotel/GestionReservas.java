package objetos2.java.reservasHotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;

public class GestionReservas {

    private ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();

    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();

    public void agregarHabitacion(Habitacion habitacion) {
        if (!habitaciones.contains(habitacion)) {
            habitaciones.add(habitacion);
            System.out.println("Habitacion numero " + habitacion.numero + " agregada correctamente");
        }else{
            System.out.println("Ya existe esta habitacion");
        }
    }

    public void mostrarHabsDispo(){
        List<Habitacion> habitacionesDispo = new ArrayList<Habitacion>();

        // Añadir las habitaciones disponibles a la lista
        for (Habitacion habitacion : habitaciones) {
            if (!habitacion.ocupada){
                habitacionesDispo.add(habitacion);
            }
        }


        if (!habitacionesDispo.isEmpty()) {
            System.out.println("Habitaciones disponibles: ");

            for (Habitacion habitacion : habitacionesDispo) {
                habitacion.mostrarInfo();
            }
        }else{
            System.out.println("No hay habitaciones disponibles");
        }
    }


    public void reservarHabitacion(Cliente cliente, Habitacion habitacion) {
        if (!habitacion.ocupada && habitaciones.contains(habitacion)) {
            Reserva reserva = new Reserva(habitacion, cliente);
            reservas.add(reserva);
            habitacion.ocupada = true;
            System.out.println("Reserva de la habitacion con numero " + habitacion.numero + " realizada correctemante por el cliente " + cliente.nombre);
        }else{
            System.out.println("Habitacion no disponible para reservar");
        }
    }


    public void cancelarHabitacion(Cliente cliente, Habitacion habitacion) {
        ArrayList<Reserva> reservasCancelar = new ArrayList<Reserva>();

        for (Reserva reserva : reservas) {
            if (Objects.equals(reserva.cliente.nombre, cliente.nombre) && Objects.equals(reserva.habitacion.numero, habitacion.numero)){
                reservasCancelar.add(reserva);
            }
        }

        if (!reservasCancelar.isEmpty()) {
            reservasCancelar.removeAll(reservas);
            habitacion.ocupada = false;
            System.out.println("Reserva del cliente " + cliente.nombre + " de la habitacion " + habitacion.numero + " cancelada correctamente");
        }else{
            System.out.println("No existe ninguna reserva para el cliente " + cliente.nombre + " y numero de habitacion " + habitacion.numero);
        }

    }

    public void mostrarReservas(){
        if (!reservas.isEmpty()) {
            System.out.println("Listado de reservas: ");
            for (Reserva reserva : reservas) {
                System.out.println("- Num habitacion: " + reserva.habitacion.numero + ", Cliente: " + reserva.cliente.nombre + ", Fecha reserva: " + reserva.fecha);
            }
        }else{
            System.out.println("No hay reservas actualmente");
        }
    }
}
