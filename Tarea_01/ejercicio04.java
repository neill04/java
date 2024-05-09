import java.util.Scanner;

public class EquivalenciaDolares {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la cantidad en soles
        System.out.print("Ingresa la cantidad en soles: ");
        double cantidadSoles = scanner.nextDouble();

        // Pedir al usuario que ingrese el precio de cambio de soles a dólares
        System.out.print("Ingresa el precio de cambio de soles a dólares: ");
        double precioCambio = scanner.nextDouble();

        // Calcular la equivalencia en dólares
        double equivalenciaDolares = cantidadSoles * precioCambio;

        // Mostrar la equivalencia en dólares
        System.out.println("La equivalencia en dólares es: $" + equivalenciaDolares);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
