package objetos2.java.juegoRol;

public abstract class Personaje {
    String nombre;
    int vida;
    int danioBase;

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
        this.danioBase = 10;
    }

    public abstract void atacar(Personaje personaje);

    public void recibirDanio(int cantidad){
        vida -= cantidad;
        if (vida <= 0) vida = 0;
        System.out.println(nombre + " recibe " + cantidad + " de daño. Vida restante: " + vida);
    }

    public boolean estaVivo(){
        return vida > 0;
    }




}
