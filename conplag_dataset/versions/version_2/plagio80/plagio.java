// plagiado_80.java
import java.time.LocalDateTime; // Uso de java.time (API moderna de fechas)
import java.time.format.DateTimeFormatter; // Para formateo

public class ObtenerMomentoActual { // Renombrado de clase
    public static void main(String[] args) {
        LocalDateTime ahora = LocalDateTime.now(); // Uso de LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // Formato personalizado
        String fechaFormateada = ahora.format(formatter);
        System.out.println("Momento presente: " + fechaFormateada); // Cambio de mensaje
    }
}