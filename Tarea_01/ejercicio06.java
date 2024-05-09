import java.util.Scanner;

public class ConversionCelsiusToFahrenheit {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la temperatura en grados Celsius
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Calcular la temperatura en grados Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Mostrar la temperatura convertida en grados Fahrenheit
        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
