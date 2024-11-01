package objetos2.java.gestionBiblioteca;


import java.util.ArrayList;

public class Usuario {
    String nombre;
    ArrayList<Libro> prestamos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.prestamos = new ArrayList<Libro>();
    }
}
