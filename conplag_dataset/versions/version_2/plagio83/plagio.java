import java.util.LinkedList;
import java.util.List;

public class RemoverItemDeColeccion {
    public static void main(String[] args) {
        List<String> items = new LinkedList<>();
        items.add("Rojo");
        items.add("Verde");
        items.add("Azul");
        
        List<String> itemsFiltrados = new LinkedList<>();
        for (String item : items) {
            if (!item.equals("Verde")) {
                itemsFiltrados.add(item);
            }
        }
        System.out.println("Colección sin el item: " + itemsFiltrados);
    }
}