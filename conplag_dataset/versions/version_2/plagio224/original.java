import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarListaNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);
    }
}