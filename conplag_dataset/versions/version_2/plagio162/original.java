import java.util.ArrayList;
import java.util.List;

public class RecorrerListaConIndice {
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();
        ciudades.add("Madrid");
        ciudades.add("París");
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("Ciudad: " + ciudades.get(i));
        }
    }
}