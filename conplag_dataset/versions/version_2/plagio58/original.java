// original_58.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MezclarLista {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");
        Collections.shuffle(frutas);
        System.out.println("Lista mezclada: " + frutas);
    }
}