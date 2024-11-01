package objetos2.java.gestionBiblioteca;

import java.util.UUID;

public class Libro {
    String titulo;
    String autor;
    boolean prestado;
    UUID isbn = UUID.randomUUID();

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Prestado: " + prestado + ", ISBN: " + isbn);
    }
}
