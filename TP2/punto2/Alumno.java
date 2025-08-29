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