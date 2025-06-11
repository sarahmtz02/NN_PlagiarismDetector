import java.util.LinkedList;
import java.util.List;

public class IterarElementosColeccion {
    public static void main(String[] args) {
        List<String> vegetales = new LinkedList<>();
        vegetales.add("Zanahoria");
        vegetales.add("Tomate");
        for (String vegetal : vegetales) {
            System.out.println("Vegetal: " + vegetal);
        }
    }
}