public class Televisor {
    private String marca;
    private int pulgadas;
    private String resolucion;
    private boolean encendido;
    private int canalActual;
    private int canalAnterior;
    private int volumen;

    public Televisor(String marca, int pulgadas, String resolucion) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.encendido = false;
        this.canalActual = 1;
        this.canalAnterior = 1;
        this.volumen = 10;
    }

    public void encender() {
        encendido = true;
        System.out.println("Televisor encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("Televisor apagado.");
    }

    public void subirCanal() {
        if (encendido) {
            canalAnterior = canalActual;
            canalActual++;
            System.out.println("Canal subido a: " + canalActual);
        } else {
            System.out.println("El televisor está apagado.");
        }
    }

    public void bajarCanal() {
        if (encendido && canalActual > 1) {
            canalAnterior = canalActual;
            canalActual--;
            System.out.println("Canal bajado a: " + canalActual);
        } else {
            System.out.println("El televisor está apagado o ya está en el canal más bajo.");
        }
    }

    public void volverCanalAnterior() {
        if (encendido) {
            int temp = canalActual;
            canalActual = canalAnterior;
            canalAnterior = temp;
            System.out.println("Volviendo al canal anterior: " + canalActual);
        } else {
            System.out.println("El televisor está apagado.");
        }
    }

    public void subirVolumen() {
        if (encendido && volumen < 100) {
            volumen++;
            System.out.println("Volumen: " + volumen);
        } else if (!encendido) {
            System.out.println("El televisor está apagado.");
        }
    }

    public void bajarVolumen() {
        if (encendido && volumen > 0) {
            volumen--;
            System.out.println("Volumen: " + volumen);
        } else if (!encendido) {
            System.out.println("El televisor está apagado.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }

    public int getCanalActual() {
        return canalActual;
    }

    public int getVolumen() {
        return volumen;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setCanalActual(int canal) {
        if (encendido && canal > 0) {
            canalAnterior = canalActual;
            canalActual = canal;
            System.out.println("Cambiado al canal: " + canalActual);
        }
    }

    public void setVolumen(int volumen) {
        if (encendido && volumen >= 0 && volumen <= 100) {
            this.volumen = volumen;
            System.out.println("Volumen ajustado a: " + volumen);
        }
    }
}
