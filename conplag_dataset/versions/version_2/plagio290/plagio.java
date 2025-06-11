public class RetrasarEjecucion {
    public static void main(String[] args) {
        System.out.println("Esperando 2 segundos...");
        try {
            Thread.sleep(2000); // Espera 2000 milisegundos = 2 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("La espera fue interrumpida.");
        }
        System.out.println("Ejecución después de la espera.");
    }
}