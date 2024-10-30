package gestionBiblioteca

class Biblioteca {

    private val libros = mutableListOf<Libro>()
    private val usuarios = mutableListOf<Usuario>()

    fun agregarLibro(libro: Libro) {
        if (!libros.contains(libro)) {
            libros.add(libro)
            println("Libro añadido correctamente")
        }else{
            println("Ya existe este libro.")
        }
    }

    fun registrarUsuario(usuario: Usuario) {
        if (!usuarios.contains(usuario)) {
            usuarios.add(usuario)
            println("Usuario registrado correctamente")
        }else{
            println("Ya existe este usuario.")
        }
    }

    fun prestarLibro(libro: Libro, usuario: Usuario) {
        if (libro.prestado){
            println("Error. El libro está actualmente prestado.")
        }else{
            usuario.prestamos.add(libro)
            libro.prestado = true
            println("Libro prestado correctamente.")
        }
    }

    fun devolverLibro(libro: Libro, usuario: Usuario) {
        if (!libro.prestado){
            println("El libro no está prestado")
        }else{
            if (usuario.prestamos.contains(libro)){
                usuario.prestamos.remove(libro)
                libro.prestado = false
                println("Libro devuelto correctamente")
            }else{
                println("Error al devolver. El libro lo tiene otro usuario!!")
            }
        }
    }

    fun mostrarInfoUsersLibros(){
        println("Lista usuarios registrados: ")

        usuarios.forEach {usuario ->
            if (usuario.prestamos.isNotEmpty()){
                println("${usuario.nombre} tiene prestados: ")
                usuario.prestamos.forEach {libro ->
                    println(libro)
                }
            }else{
                println("${usuario.nombre}, sin préstamos")
            }


        }
    }

}