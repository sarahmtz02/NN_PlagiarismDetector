import java.util.ArrayList;
import java.util.List;

public class FiltrarColeccion {
    public static void main(String[] args) {
        List<String> participantes = new ArrayList<>();
        participantes.add("Carlos");
        participantes.add("Sofía");
        
        List<String> filtrados = new ArrayList<>();
        for (String p : participantes) {
            if (!p.equals("Sofía")) {
                filtrados.add(p);
            }
        }
        System.out.println("Lista sin el elemento: " + filtrados);
    }
}