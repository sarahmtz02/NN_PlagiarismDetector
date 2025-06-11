// original_8.java
import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Elemento: " + numeros.get(i));
        }
    }
}