public class ejemplo01 {
    public static void main(String[] args) {
        System.out.println("Metodos en Java \n");
        dibujarTriangulo();
        dibujarTriangulo("#");
        dibujarTriangulo("Java");
    }

    public static void dibujarTriangulo() {
        String texto = "*";
        for (int n = 1; n <= 5; n++) {
            System.out.println(texto);
            texto += "*";
        }
    }

    public static void dibujarTriangulo(String texto) {
        String cadena = texto;
        for (int n = 1; n <= 5; n++) {
            System.out.println(texto);
            texto += cadena;
        }
    }
}
