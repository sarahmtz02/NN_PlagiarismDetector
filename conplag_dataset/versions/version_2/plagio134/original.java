import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InvertirOrdenLista {
    public static void main(String[] args) {
        List<String> elementos = new ArrayList<>();
        elementos.add("Uno");
        elementos.add("Dos");
        elementos.add("Tres");
        Collections.reverse(elementos);
        System.out.println("Lista invertida: " + elementos);
    }
}