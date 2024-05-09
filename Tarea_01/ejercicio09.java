public class CalcularVelocidadTren {
    public static void main(String[] args) {
        // Velocidad y tiempo inicial
        double velocidadInicial = 40; // km/h
        double tiempoInicial = 6; // horas
        double distancia = velocidadInicial * tiempoInicial; // Distancia recorrida en la situación inicial

        // Tiempo para la segunda situación
        double tiempoSegundaSituacion = 5; // horas

        // Calcular la velocidad para la segunda situación
        double velocidadSegundaSituacion = distancia / tiempoSegundaSituacion;

        // Mostrar la velocidad para la segunda situación
        System.out.println("La velocidad que debe llevar el tren para hacer el mismo recorrido en 5 horas es: " + velocidadSegundaSituacion + " km/h");
    }
}
