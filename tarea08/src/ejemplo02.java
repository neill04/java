public class ejemplo02 {
    public static void main(String[] args) {
        System.out.println("Sobrecarga de métodos");
        sumar(13 + 15);
        sumar(16.34 + 28.19);
        sumar("Numero " + 19);
    }

    public static void sumar(int resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public static void sumar(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public static void sumar(String resultado) {
        System.out.println("Resultado: " + resultado);
    }
}