package objetos2.java.juegoRol;

public class Guerrero extends Personaje {

    private int danioExtra = 5;

    public Guerrero(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public void atacar(Personaje personaje) {

        if (!estaVivo()){
            System.out.println(nombre + " no puede atacar porque ha sido eliminado.");
            return;
        }

        if (!personaje.estaVivo()){
            System.out.println(personaje.nombre + " ya ha sido eliminado, no se le puede atacar.");
            return;
        }


        int danioTotal = danioBase + danioExtra;
        System.out.println(nombre + " ataca con su hacha a " + personaje.nombre + " haciendo un daño de " + danioTotal);
        personaje.recibirDanio(danioTotal);
    }
}
