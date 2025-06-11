import java.util.HashSet;
import java.util.Set;

public class ConjuntoBasico {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Manzana"); // Duplicado, no se añade
        System.out.println("Elementos del conjunto: " + frutas);
    }
}