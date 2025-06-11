import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatearFechaHora {
    public static void main(String[] args) {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaFormateada = ahora.format(formatter);
        System.out.println("Fecha y hora formateada: " + fechaFormateada);
    }
}