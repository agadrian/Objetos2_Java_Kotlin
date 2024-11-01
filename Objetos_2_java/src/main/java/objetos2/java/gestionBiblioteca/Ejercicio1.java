package objetos2.java.gestionBiblioteca;


public class Ejercicio1 {
    public static void ejercicioGestionBiblioteca() {
        System.out.println("\n** Ejercicio gestión biblioteca **");

        Usuario user1 = new Usuario("Adri");
        Usuario user2 = new Usuario("Juan");

        Libro libro1 = new Libro("Harry potter", "yo");
        Libro libro2 = new Libro("Alvin", "Ardillero");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(libro1);
        biblioteca.registrarUsuario(user1);
        biblioteca.registrarUsuario(user2);
        biblioteca.prestarLibro(libro1, user1);
        biblioteca.prestarLibro(libro2, user2);

        biblioteca.devolverLibro(libro1,user2);
        biblioteca.devolverLibro(libro1,user1);
        biblioteca.devolverLibro(libro2,user2);

        biblioteca.prestarLibro(libro2, user1);

        biblioteca.mostrarInfoUsersLibros();
    }
}
