import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecorrerListaConIterator {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        Iterator<String> it = frutas.iterator();
        while (it.hasNext()) {
            System.out.println("Fruta: " + it.next());
        }
    }
}