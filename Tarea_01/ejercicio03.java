import java.util.Scanner;

public class CalificacionFinal {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese las calificaciones
        System.out.print("Ingresa la calificación del examen final: ");
        double calificacionExamen = scanner.nextDouble();

        System.out.print("Ingresa la calificación de la carpeta de trabajo: ");
        double calificacionCarpeta = scanner.nextDouble();

        System.out.print("Ingresa la calificación del primer trabajo o informe: ");
        double trabajo1 = scanner.nextDouble();

        System.out.print("Ingresa la calificación del segundo trabajo o informe: ");
        double trabajo2 = scanner.nextDouble();

        System.out.print("Ingresa la calificación del tercer trabajo o informe: ");
        double trabajo3 = scanner.nextDouble();

        // Calcular el promedio de los tres trabajos
        double promedioTrabajos = (trabajo1 + trabajo2 + trabajo3) / 3;

        // Calcular la calificación final utilizando la fórmula
        double calificacionFinal = 0.5 * calificacionExamen + 0.35 * calificacionCarpeta + 0.15 * promedioTrabajos;

        // Mostrar la calificación final
        System.out.println("La calificación final del alumno es: " + calificacionFinal);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
