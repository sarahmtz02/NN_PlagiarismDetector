import java.util.ArrayList;
import java.util.List;

public class LimpiarLista {
    public static void main(String[] args) {
        List<String> elementos = new ArrayList<>();
        elementos.add("A");
        elementos.add("B");
        elementos.clear();
        System.out.println("Lista después de limpiar: " + elementos);
    }
}