import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjecutarTareaProgramada {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable tarea = () -> System.out.println("Tarea programada ejecutada.");
        scheduler.schedule(tarea, 2, TimeUnit.SECONDS);
        scheduler.shutdown();
    }
}