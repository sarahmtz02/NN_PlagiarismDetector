// plagiado_67.java
import java.util.Arrays; // Uso de Arrays para crear la lista
import java.util.Iterator; // Uso de Iterator
import java.util.List;

public class IterarColeccion { // Renombrado de clase
    public static void main(String[] args) {
        List<String> elementos = Arrays.asList("Ana", "Luis", "Carlos"); // Creación de lista diferente

        Iterator<String> it = elementos.iterator(); // Uso de Iterator
        while (it.hasNext()) {
            System.out.println("Elemento: " + it.next()); // Cambio de mensaje
        }
    }
}