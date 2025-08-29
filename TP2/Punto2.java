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
