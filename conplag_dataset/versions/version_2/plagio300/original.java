import java.util.concurrent.TimeUnit;

public class ThreadSleepSimple {
    public static void main(String[] args) {
        System.out.println("Esperando 1 segundo...");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("La espera fue interrumpida.");
        }
        System.out.println("Fin de la espera.");
    }
}