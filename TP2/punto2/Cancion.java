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