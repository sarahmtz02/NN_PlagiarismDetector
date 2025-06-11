// original_32.java
import java.util.ArrayList;
import java.util.List;

public class FiltrarNumerosPares {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        List<Integer> pares = new ArrayList<>();
        for (Integer num : numeros) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }
        System.out.println("Números pares: " + pares);
    }
}