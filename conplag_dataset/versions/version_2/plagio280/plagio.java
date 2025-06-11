import java.util.ArrayList;
import java.util.List;

public class SimularColaConLista {
    public static void main(String[] args) {
        List<String> fila = new ArrayList<>();
        fila.add("Cliente A");
        fila.add("Cliente B");
        
        System.out.println("Primer elemento: " + fila.get(0));
        String atendido = fila.remove(0);
        System.out.println("Atendido: " + atendido);
        System.out.println("Fila actual: " + fila);
    }
}