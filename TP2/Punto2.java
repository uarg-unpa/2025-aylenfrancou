public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private String legajo;
    private String curso;
    public Alumno(String nombre, String apellido, int edad, String legajo, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.legajo = legajo;
        this.curso = curso;
    }
    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    public void mostrarInfo() {
        System.out.println("Alumno: " + nombre + " " + apellido + " - Legajo: " + legajo);
    }
}
public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    int paginas;
    public Libro(String titulo, String autor, String genero, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.paginas = paginas;
    }
    public void leer() {
        System.out.println("Estás leyendo el libro: " + titulo);
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " de " + autor + " (" + genero + ")");
    }
}
public class Cancion {
    private String titulo;
    private String artista;
    private double duracion;
    public Cancion(String titulo, String artista, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }
    public void reproducir() {
        System.out.println("Reproduciendo: " + titulo + " por " + artista);
    }

    public void mostrarInfo() {
        System.out.println("Canción: " + titulo + " - Artista: " + artista + " - Duración: " + duracion + " min");
    }
}
public class Televisor {
    private String marca;
    private int pulgadas;
    private String resolucion;
    private boolean encendido;
    public Televisor(String marca, int pulgadas, String resolucion) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.encendido = false;
    }
    public void encender() {
        encendido = true;
        System.out.println("El televisor está encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("El televisor está apagado.");
    }

    public void mostrarInfo() {
        System.out.println("Televisor " + marca + " - " + pulgadas + "'' - Resolución: " + resolucion);
    }
}
