import java.util.Scanner;

public class LongitudCircunferencia {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el radio de la circunferencia
        System.out.print("Ingresa el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        // Calcular la longitud de la circunferencia
        double longitud = 2 * Math.PI * radio;

        // Mostrar la longitud de la circunferencia
        System.out.println("La longitud de la circunferencia con radio " + radio + " es: " + longitud);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
