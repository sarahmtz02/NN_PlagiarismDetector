import java.util.ArrayList;
import java.util.List;

public class ObtenerElementoDeLista {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Primer item");
        items.add("Segundo item");
        items.add("Tercer item");
        System.out.println("Item en posición 1: " + items.get(1));
    }
}