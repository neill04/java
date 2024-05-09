import java.util.Scanner;

public class CalcularNumeroPartidos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número de equipos
        System.out.print("Ingresa el número de equipos en el campeonato: ");
        int nEquipos = scanner.nextInt();

        // Calcular el número de partidos en la primera rueda del campeonato
        int numeroPartidos = (nEquipos * (nEquipos - 1)) / 2;

        // Mostrar el número de partidos en la primera rueda
        System.out.println("En la primera rueda del campeonato habrá " + numeroPartidos + " partidos.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
