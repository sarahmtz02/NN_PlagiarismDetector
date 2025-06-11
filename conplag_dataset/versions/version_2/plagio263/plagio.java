import java.util.LinkedList;
import java.util.List;

public class VaciarColeccion {
    public static void main(String[] args) {
        List<Integer> numeros = new LinkedList<>();
        numeros.add(1);
        numeros.add(2);
        
        while (!numeros.isEmpty()) {
            numeros.remove(0); // Remover uno por uno
        }
        System.out.println("Colección vacía: " + numeros);
    }
}