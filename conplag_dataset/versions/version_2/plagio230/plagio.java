import java.util.ArrayList;
import java.util.List;

public class SimularPilaConLista {
    public static void main(String[] args) {
        List<String> elementos = new ArrayList<>();
        elementos.add("Base");
        elementos.add("Medio");
        
        System.out.println("Elemento superior: " + elementos.get(elementos.size() - 1));
        String extraido = elementos.remove(elementos.size() - 1);
        System.out.println("Elemento retirado: " + extraido);
        System.out.println("Elementos actuales: " + elementos);
    }
}