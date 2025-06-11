// original_61.java
import java.util.HashMap;
import java.util.Map;

public class MapaBasico {
    public static void main(String[] args) {
        Map<String, String> capitales = new HashMap<>();
        capitales.put("España", "Madrid");
        capitales.put("Francia", "París");

        System.out.println("Capital de España: " + capitales.get("España"));

        for (Map.Entry<String, String> entry : capitales.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}