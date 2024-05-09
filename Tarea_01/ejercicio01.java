import java.util.Scanner;

public class SumaDosValores {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer valor
        System.out.print("Ingresa el primer valor: ");
        int primerValor = scanner.nextInt();

        // Pedir al usuario que ingrese el segundo valor
        System.out.print("Ingresa el segundo valor: ");
        int segundoValor = scanner.nextInt();

        // Calcular la suma de los dos valores ingresados
        int suma = primerValor + segundoValor;

        // Mostrar el resultado de la suma
        System.out.println("La suma de " + primerValor + " y " + segundoValor + " es: " + suma);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
