import java.util.ArrayList;
import java.util.List;

public class AccederElementoPorIndice {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        System.out.println("Primera fruta: " + frutas.get(0));
    }
}