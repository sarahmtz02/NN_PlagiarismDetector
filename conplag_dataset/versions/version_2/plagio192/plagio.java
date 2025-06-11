import java.util.LinkedList;
import java.util.List;

public class VerificarColeccionVacia {
    public static void main(String[] args) {
        List<Integer> numeros = new LinkedList<>();
        if (numeros.size() == 0) {
            System.out.println("La colección no tiene elementos.");
        } else {
            System.out.println("La colección tiene elementos.");
        }
    }
}