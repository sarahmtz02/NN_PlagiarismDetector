import java.util.ArrayList;
import java.util.List;

public class FiltrarElementosLista {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>();
        valores.add(1);
        valores.add(2);
        valores.add(3);
        
        List<Integer> resultados = new ArrayList<>();
        for (int val : valores) {
            if (val % 2 == 0) {
                resultados.add(val);
            }
        }
        System.out.println("Elementos filtrados: " + resultados);
    }
}