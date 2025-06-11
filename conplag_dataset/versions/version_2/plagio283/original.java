import java.util.HashSet;
import java.util.Set;

public class ComprobarElementoEnSet {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        if (frutas.contains("Manzana")) {
            System.out.println("El Set contiene Manzana.");
        } else {
            System.out.println("El Set no contiene Manzana.");
        }
    }
}