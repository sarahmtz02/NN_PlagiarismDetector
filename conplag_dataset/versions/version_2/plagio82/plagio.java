// plagiado_82.java
import java.util.ArrayList;
import java.util.Collections; // Uso de Collections.copy
import java.util.List;

public class DuplicarColeccion { // Renombrado de clase
    public static void main(String[] args) {
        List<String> fuente = new ArrayList<>(); // Renombrado de lista
        fuente.add("A");
        fuente.add("B");

        List<String> duplicado = new ArrayList<>(fuente.size()); // Inicializar con tamaño
        for(int i = 0; i < fuente.size(); i++){ // Llenar la lista duplicada con nulls
            duplicado.add(null);
        }
        Collections.copy(duplicado, fuente); // Uso de Collections.copy
        
        duplicado.add("C");
        System.out.println("Lista Fuente: " + fuente); // Cambio de mensaje
        System.out.println("Lista Duplicada: " + duplicado); // Cambio de mensaje
    }
}