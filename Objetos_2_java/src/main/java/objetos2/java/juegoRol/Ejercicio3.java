package objetos2.java.juegoRol;

public class Ejercicio3 {
    public static void juegoRPG(){
        System.out.println("** Ejercicio juego RPG **");

        Guerrero guerrero = new Guerrero("Pedropicapiedra", 50);
        Mago mago = new Mago("Oz", 70, 40);
        Hechizo tornado = new Hechizo("Tornado", 20, 15);

        mago.otorgarHechizo(tornado);
        mago.atacar(guerrero);
        guerrero.atacar(mago);
        mago.atacar(guerrero);
        guerrero.atacar(mago);
        mago.atacar(guerrero);
    }
}
