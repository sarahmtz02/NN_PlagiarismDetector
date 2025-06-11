import java.util.ArrayList;
import java.util.List;

public class SimularColaConLista {
    public static void main(String[] args) {
        List<String> elementos = new ArrayList<>();
        elementos.add("Paso A");
        elements.add("Paso B");
        
        System.out.println("Primer elemento: " + elementos.get(0));
        String extraido = elementos.remove(0);
        System.out.println("Elemento extraído: " + extraido);
        System.out.println("Elementos restantes: " + elementos);
    }
}