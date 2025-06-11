import java.util.HashMap;
import java.util.Map;

public class AccesoMapaPorClave {
    public static void main(String[] args) {
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Alice", 30);
        edades.put("Bob", 25);
        System.out.println("Edad de Alice: " + edades.get("Alice"));
    }
}