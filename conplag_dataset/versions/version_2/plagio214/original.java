import java.util.HashMap;
import java.util.Map;

public class ComprobarClaveEnMapa {
    public static void main(String[] args) {
        Map<String, String> configuracion = new HashMap<>();
        configuracion.put("tema", "oscuro");
        if (configuracion.containsKey("tema")) {
            System.out.println("La configuración de tema existe.");
        } else {
            System.out.println("La configuración de tema no existe.");
        }
    }
}