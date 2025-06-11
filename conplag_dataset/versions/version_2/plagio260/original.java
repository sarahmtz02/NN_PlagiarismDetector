import java.time.LocalDate;

public class ObtenerFechaActual {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println("Fecha actual: " + hoy);
    }
}