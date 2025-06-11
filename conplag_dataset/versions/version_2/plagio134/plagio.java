import java.util.ArrayList;
import java.util.List;

public class ReordenarColeccion {
    public static void main(String[] args) {
        List<String> itemsOriginales = new ArrayList<>();
        itemsOriginales.add("Uno");
        itemsOriginales.add("Dos");
        itemsOriginales.add("Tres");
        
        List<String> itemsInvertidos = new ArrayList<>();
        for (int i = itemsOriginales.size() - 1; i >= 0; i--) {
            itemsInvertidos.add(itemsOriginales.get(i));
        }
        System.out.println("Colección en orden inverso: " + itemsInvertidos);
    }
}