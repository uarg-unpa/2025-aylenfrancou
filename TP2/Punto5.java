public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int minutos, int segundos) {
        if (esHoraValida(hora, minutos, segundos)) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    private boolean esHoraValida(int h, int m, int s) {
        return (h >= 0 && h <= 23) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59);
    }

    public void setHora(int h) {
        if (h >= 0 && h <= 23) {
            hora = h;
        }
    }

    public void setMinutos(int m) {
        if (m >= 0 && m <= 59) {
            minutos = m;
        }
    }

    public void setSegundos(int s) {
        if (s >= 0 && s <= 59) {
            segundos = s;
        }
    }

    public int obtenerTotalMinutos() {
        return (hora * 60) + minutos + (segundos >= 30 ? 1 : 0);
    }

    public void mostrarHora() {
        System.out.printf("la hora es:", hora, minutos, segundos);
    }
}
