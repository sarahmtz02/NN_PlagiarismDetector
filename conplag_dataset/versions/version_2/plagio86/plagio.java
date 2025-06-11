import java.util.LinkedHashSet;
import java.util.Set;

public class ColeccionUnica {
    public static void main(String[] args) {
        Set<String> elementos = new LinkedHashSet<>();
        elementos.add("Manzana");
        elementos.add("Banana");
        elementos.add("Manzana");
        
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        boolean primera = true;
        for (String s : elementos) {
            if (!primera) {
                sb.append(", ");
            }
            sb.append(s);
            primera = false;
        }
        sb.append("]");
        System.out.println("Contenido único: " + sb.toString());
    }
}