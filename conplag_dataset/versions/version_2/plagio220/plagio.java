public class InicializacionDeClase {
    public static void iniciar() {
        System.out.println("Método de inicialización llamado explícitamente.");
    }

    public static void main(String[] args) {
        InicializacionDeClase.iniciar(); // Simula la ejecución de un bloque estático al llamar un método al inicio
        System.out.println("Proceso principal iniciado.");
    }
}