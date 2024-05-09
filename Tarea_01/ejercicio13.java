import java.util.Scanner;

public class CalcularSumaSerie {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el valor de n
        System.out.print("Ingresa el valor de n: ");
        int n = scanner.nextInt();

        // Variable para almacenar la suma de la serie
        int suma = 0;

        // Calcular la suma de la serie
        for (int i = 1; i <= n; i++) {
            suma += i * (i + 1);
        }

        // Mostrar la suma de la serie
        System.out.println("La suma de la serie es: " + suma);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
