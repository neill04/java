import java.util.Scanner;

public class CalculadoraInteres {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el capital inicial
        System.out.print("Ingresa el capital inicial invertido: ");
        double capitalInicial = scanner.nextDouble();

        // Calcular el interés ganado después de un mes (2% mensual)
        double interesMensual = capitalInicial * 0.02;

        // Calcular el capital final después de un mes (capital inicial + interés)
        double capitalFinal = capitalInicial + interesMensual;

        // Mostrar el resultado
        System.out.println("Después de un mes, ganarás $" + interesMensual + " de interés.");
        System.out.println("Tu capital final será de $" + capitalFinal);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
