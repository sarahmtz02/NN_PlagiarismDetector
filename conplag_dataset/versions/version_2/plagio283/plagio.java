import java.util.ArrayList;
import java.util.List;

public class BuscarEnColeccion {
    public static void main(String[] args) {
        List<String> vegetales = new ArrayList<>();
        vegetales.add("Zanahoria");
        vegetales.add("Pepino");
        boolean encontrado = false;
        for (String veg : vegetales) {
            if (veg.equals("Zanahoria")) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El elemento 'Zanahoria' está en la lista.");
        } else {
            System.out.println("El elemento 'Zanahoria' no está en la lista.");
        }
    }
}