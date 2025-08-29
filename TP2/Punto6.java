public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    public Fecha(int dia, int mes, int anio) {
        if (esFechaValida(dia, mes, anio)) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.anio = 2013;
        }
    }

    private boolean esFechaValida(int d, int m, int a) {
        if (a < 1 || m < 1 || m > 12 || d < 1) return false;

        int diasEnMes;
        switch (m) {
            case 2:
                diasEnMes = esBisiesto(a) ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                diasEnMes = 30;
                break;
            default:
                diasEnMes = 31;
        }

        return d <= diasEnMes;
    }

    private boolean esBisiesto(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int d) {
        if (esFechaValida(d, mes, anio)) {
            this.dia = d;
        }
    }

    public void setMes(int m) {
        if (esFechaValida(dia, m, anio)) {
            this.mes = m;
        }
    }

    public void setAnio(int a) {
        if (esFechaValida(dia, mes, a)) {
            this.anio = a;
        }
    }

    public String obtenerNombreMes() {
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"
        };
        return nombresMeses[mes - 1];
    }

    public void mostrarFecha() {
        System.out.println(dia + " de " + obtenerNombreMes() + " de " + anio);
    }
}
