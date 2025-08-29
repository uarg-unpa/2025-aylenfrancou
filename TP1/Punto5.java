public  class Punto5{
     public static void main(String[] args) {
         System.out.println("Ingrese un día de la semana (L, M, I, J, V, S, D):");
         char dia = console.readChar ();
         switch (dia) {
            case 'M': // Martes
            case 'J': // Jueves
            case 'V': // Viernes
                System.out.println("HOY TENGO RESOLUCION");
                break;
            case 'L':
            case 'I':
            case 'S':
            case 'D':
                System.out.println("HOY NO TENGO RESOLUCION");
                break;
            default:
                System.out.println("DÍA NO VÁLIDO");
        }
}