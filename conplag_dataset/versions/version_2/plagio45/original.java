// original_45.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EncontrarMayorEnLista {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(20);
        numeros.add(15);

        int maximo = Collections.max(numeros);
        System.out.println("El número mayor en la lista es: " + maximo);
    }
}