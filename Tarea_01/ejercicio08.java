import java.util.Scanner;

public class CalcularAreaRectangulo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la base del rectángulo
        System.out.print("Ingresa la longitud de la base del rectángulo: ");
        double base = scanner.nextDouble();

        // Pedir al usuario que ingrese la altura del rectángulo
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        // Calcular el área del rectángulo
        double area = base * altura;

        // Mostrar el área del rectángulo
        System.out.println("El área del rectángulo es: " + area);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
