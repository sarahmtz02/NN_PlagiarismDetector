// plagiado_61.java
import java.util.Hashtable; // Cambio de implementación de Map
import java.util.Map;

public class DiccionarioSimple { // Renombrado de clase
    public static void main(String[] args) {
        Map<String, String> elementos = new Hashtable<>(); // Uso de Hashtable
        elementos.put("España", "Madrid");
        elementos.put("Francia", "París");
        elementos.put("Italia", "Roma"); // Añadiendo un elemento extra

        System.out.println("La capital de Francia es: " + elementos.get("Francia")); // Acceso a otro elemento
        
        // Iteración con keySet y get
        for (String clave : elementos.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + elementos.get(clave));
        }
    }
}