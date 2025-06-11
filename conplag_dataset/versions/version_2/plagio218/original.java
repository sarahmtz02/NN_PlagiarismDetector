import java.util.ArrayList;
import java.util.List;

public class IterarYModificarLista {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        
        // Esto lanzaría ConcurrentModificationException si se usa Iterator en un for-each
        // For para modificar y evitar CME
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals("A")) {
                items.set(i, "Nuevo A");
            }
        }
        System.out.println("Lista modificada: " + items);
    }
}