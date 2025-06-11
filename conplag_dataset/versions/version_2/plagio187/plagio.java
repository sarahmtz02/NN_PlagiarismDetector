import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ColeccionDeElementosUnicos {
    public static void main(String[] args) {
        List<String> listaConDuplicados = new ArrayList<>();
        listaConDuplicados.add("Azul");
        listaConDuplicados.add("Amarillo");
        listaConDuplicados.add("Azul");
        
        Set<String> setSinDuplicados = new LinkedHashSet<>(listaConDuplicados);
        System.out.println("Elementos únicos: " + setSinDuplicados);
    }
}