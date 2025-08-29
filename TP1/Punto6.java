public class Punto6 {
      public static void main(String[] args) {
        System.out.println("Ingrese 3 números enteros:");
        int NUM1 = console.readint ();
        int NUM2 = console.readint ();
        int NUM3 = console.readint ();
        int suma = num1 + num2 + num3;
        int producto = num1 * num2 * num3;
        System.out.println("Suma de enteros: " + suma);
        System.out.println("Producto de enteros: " + producto);
    
        int suma = 0;
        int producto = 1;
        int num;
         while (i <= 3) {
            System.out.print("Ingrese número " + i + ": ");
            num = scanner.nextInt();
            suma += num;
            producto *= num;
            i++;
            System.out.println("Suma de enteros: " + suma);
            System.out.println("Producto de enteros: " + producto);
        }
        
    }
}