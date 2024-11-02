package objetos2.java.gestionTareas;

import java.util.ArrayList;

public class Usuario {
    String nombre;
    ArrayList<Proyecto> proyectos;


    public Usuario(String nombre){
        this.nombre = nombre;
        this.proyectos = new ArrayList<>();
    }

    public Proyecto crearProyecto(String nombre){
        Proyecto proyecto = new Proyecto(nombre);

        if (!proyectos.contains(proyecto)){
            proyectos.add(proyecto);
            System.out.println("Proyecto '" + nombre + "' agregado con exito");
            return proyecto;
        }else{
            System.out.println("El proyecto '" + nombre + "' ya existe");
        }
        return null;
    }
}
