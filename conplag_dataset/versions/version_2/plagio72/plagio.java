// plagiado_72.java
import java.util.ArrayList; // Uso de ArrayList
import java.util.Collections; // Uso de Collections.addAll
import java.util.List;

public class ConversionALista { // Renombrado de clase
    public static void main(String[] args) {
        String[] items = {"Juan", "Maria", "Pedro"}; // Renombrado de array
        List<String> coleccionItems = new ArrayList<>(); // Creación de ArrayList
        Collections.addAll(coleccionItems, items); // Uso de Collections.addAll
        System.out.println("Colección: " + coleccionItems); // Cambio de mensaje
    }
}