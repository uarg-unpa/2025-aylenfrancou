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