import java.util.ArrayList;
import java.util.List;

public class ObtenerSublista {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        List<Integer> sublista = numeros.subList(1, 3);
        System.out.println("Sublista: " + sublista);
    }
}