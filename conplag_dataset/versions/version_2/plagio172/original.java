import java.util.ArrayList;
import java.util.List;

public class EliminarElementoPorValor {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Carlos");
        nombres.add("Sofía");
        nombres.remove("Sofía");
        System.out.println("Lista después de eliminar: " + nombres);
    }
}