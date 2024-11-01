package objetos2.java.gestionBiblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();


    public void agregarLibro(Libro libro) {
        if (!libros.contains(libro)) {
            libros.add(libro);
            System.out.println("Libro " + libro.titulo + " agregado correctamente");
        }else{
            System.out.println("Este libro ya existe en la lista");
        }
    }

    public void registrarUsuario(Usuario usuario) {
        if (!usuarios.contains(usuario)) {
            usuarios.add(usuario);
            System.out.println("Usuario " + usuario.nombre + " agregado correctamente");
        }else{
            System.out.println("Este usuario ya existe en la lista");
        }
    }

    public void prestarLibro(Libro libro, Usuario usuario) {
        if (libro.prestado){
            System.out.println("Error. El libro ya esta prestado");
        }else{
            usuario.prestamos.add(libro);
            libro.prestado = true;
            System.out.println("Libro " + libro.titulo + " prestado correctamente");
        }
    }

    public void devolverLibro(Libro libro, Usuario usuario) {
        if (!libro.prestado){
            System.out.println("Error. El libro no está prestado");
        }else{
            if (usuario.prestamos.contains(libro)){
                usuario.prestamos.remove(libro);
                libro.prestado = false;
                System.out.println("Libro " + libro.titulo + " devuelto correctamente");
            }else{
                System.out.println("Error al devolver. El libro " + libro.titulo + " lo tiene otro usuario");
            }
        }
    }

    public void mostrarInfoUsersLibros(){
        System.out.println("Lista de usuario regsitrados: ");

        for (Usuario usuario : usuarios) {
            if (!usuario.prestamos.isEmpty()){
                System.out.println("- " + usuario.nombre + " tiene prestados: ");

                for (Libro libro : usuario.prestamos) {
                    libro.mostrarInfo();
                }
            }else{
                System.out.println("- " + usuario.nombre + ", sin prestamos");
            }
        }
    }


}
