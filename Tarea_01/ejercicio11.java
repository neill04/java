import java.util.Scanner;

public class CalcularPerimetroRectangulo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la base del rectángulo
        System.out.print("Ingresa la longitud de la base del rectángulo: ");
        double base = scanner.nextDouble();

        // Pedir al usuario que ingrese la altura del rectángulo
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        // Calcular el perímetro del rectángulo
        double perimetro = 2 * (base + altura);

        // Mostrar el perímetro del rectángulo
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
