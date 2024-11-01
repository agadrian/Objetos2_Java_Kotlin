package objetos2.java.reservasHotel;

import java.time.Instant;
import java.util.Date;

public class Reserva {
    Habitacion habitacion;
    Cliente cliente;
    Date fecha;

    public Reserva(Habitacion habitacion, Cliente cliente) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fecha = Date.from(Instant.now());
    }
}
