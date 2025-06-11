public class PausaEnEjecucion {
    public static void main(String[] args) {
        System.out.println("Iniciando pausa de 1000 milisegundos...");
        try {
            java.lang.Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Pausa forzada terminada.");
            // Restaurar el estado de interrupción
            Thread.currentThread().interrupt();
        }
        System.out.println("Pausa finalizada.");
    }
}