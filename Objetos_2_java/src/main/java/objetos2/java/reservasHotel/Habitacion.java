package objetos2.java.reservasHotel;

public class Habitacion {
    String numero;
    Boolean ocupada;

    public Habitacion(String numero) {
        this.numero = numero;
        this.ocupada = false;
    }

    public void mostrarInfo(){
        System.out.println("Habitacion numero " + numero);
    }
}
