import java.util.Scanner;

public class PresupuestoHospital {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el presupuesto anual del hospital
        System.out.print("Ingresa el presupuesto anual del hospital: ");
        double presupuestoAnual = scanner.nextDouble();

        // Calcular los presupuestos asignados a cada área
        double presupuestoGinecologia = presupuestoAnual * 0.45;
        double presupuestoTraumatologia = presupuestoAnual * 0.30;
        double presupuestoPediatria = presupuestoAnual * 0.25;

        // Mostrar los presupuestos asignados a cada área
        System.out.println("Presupuesto asignado a Ginecología: $" + presupuestoGinecologia);
        System.out.println("Presupuesto asignado a Traumatología: $" + presupuestoTraumatologia);
        System.out.println("Presupuesto asignado a Pediatría: $" + presupuestoPediatria);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
