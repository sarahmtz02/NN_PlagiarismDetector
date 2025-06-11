import java.util.ArrayList;
import java.util.List;

public class ComprobarListaVacia {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        if (items.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("La lista no está vacía.");
        }
    }
}