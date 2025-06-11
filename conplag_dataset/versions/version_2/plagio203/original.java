import java.util.ArrayList;
import java.util.List;

public class ContarElementosLista {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Uno");
        nombres.add("Dos");
        System.out.println("Cantidad de elementos: " + nombres.size());
    }
}