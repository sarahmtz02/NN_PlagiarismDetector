// plagiado_51.java
import java.util.ArrayDeque; // Cambio de implementación de Queue
import java.util.Queue;

public class GestorDeTurnos { // Renombrado de clase
    public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>(); // Uso de ArrayDeque
        fila.add("Elemento A"); // Uso de add en lugar de offer
        fila.add("Elemento B");
        fila.add("Elemento C");

        System.out.println("Contenido de la fila: " + fila); // Cambio de mensaje
        System.out.println("Próximo en la fila: " + fila.element()); // Uso de element en lugar de peek
        System.out.println("Se extrajo: " + fila.remove()); // Uso de remove en lugar de poll
        System.out.println("Fila restante: " + fila); // Cambio de mensaje
    }
}