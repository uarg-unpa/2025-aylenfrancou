public class Main {
    public static void main(String[] args) {
        Fecha f1 = new Fecha(15, 9, 2023);
        Fecha f2 = new Fecha(20, 3, 2025);
        if (f1.getAnio() > f2.getAnio()) {
            System.out.printf("La fecha con mayor año es:", f1.getDia(), f1.getMes(), f1.getAnio());
        } else if (f2.getAnio() > f1.getAnio()) {
            System.out.printf("La fecha con mayor año es:", f2.getDia(), f2.getMes(), f2.getAnio());
        } else {
            System.out.println("Ambas fechas tienen el mismo año: " + f1.getAnio());
        }
    }
}
