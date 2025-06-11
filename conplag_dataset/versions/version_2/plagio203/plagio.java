import java.util.Arrays;
import java.util.List;

public class TamanoDeColeccion {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("A", "B", "C");
        int contador = 0;
        for (String item : items) {
            contador++;
        }
        System.out.println("Total de ítems: " + contador);
    }
}