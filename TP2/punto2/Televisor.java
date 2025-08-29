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