// plagiado_58.java
import java.util.Arrays; // Importación para Arrays.asList
import java.util.List;
import java.util.Random; // Uso de Random

public class DesordenarElementos { // Renombrado de clase
    public static void main(String[] args) {
        List<String> elementos = Arrays.asList("Manzana", "Banana", "Cereza"); // Creación de lista diferente
        Random rand = new Random(); // Instancia de Random

        for (int i = elementos.size() - 1; i > 0; i--) { // Algoritmo de Fisher-Yates manual
            int j = rand.nextInt(i + 1);
            String temp = elementos.get(i);
            elementos.set(i, elementos.get(j));
            elementos.set(j, temp);
        }
        System.out.println("Elementos desordenados: " + elementos); // Cambio de mensaje
    }
}