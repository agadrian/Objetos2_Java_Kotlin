package objetos2.java.juegoRol;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Personaje{
    int mana;
    private List<Hechizo> hechizos = new ArrayList<Hechizo>();
    private int danioExtra = 8;

    public Mago(String nombre, int vida, int mana) {
        super(nombre, vida);
        this.mana = mana;
    }

    public void otorgarHechizo(Hechizo hechizo){
        hechizos.add(hechizo);
        System.out.println(nombre + " obtuvo el hechizo: " + hechizo.nombre);
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

        if (hechizos.isEmpty()){
            System.out.println(nombre + " no tiene hechizos y ataca cuerpo a cuerpo");
            personaje.recibirDanio(danioBase + danioExtra);
            return;
        }

        Hechizo hechizo = hechizos.getFirst();// Primer hechizo de la lista
        if (mana > hechizo.costeMana){
            mana -= hechizo.costeMana;
            int danioTotal = danioBase + danioExtra + hechizo.danio;
            System.out.println(nombre + " ha atacado con el hechizo " + hechizo.nombre + " contra " + personaje.nombre + " haciendo " + danioTotal + " de daño.");
            personaje.recibirDanio(danioTotal);
        }else{
            int danioTotal = danioBase + danioExtra;
            System.out.println(nombre + " no tiene sufciente mana para lanzar el hechizo, y ataca cuerpo a cuerpo, haciendo " + danioTotal + " de daño");
            personaje.recibirDanio(danioBase + danioExtra);
        }
    }
}
