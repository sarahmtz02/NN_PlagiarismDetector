import java.util.ArrayList;
import java.util.List;

public class TablaDeDatos {
    public static void main(String[] args) {
        List<List<Integer>> tabla = new ArrayList<>();
        List<Integer> fila1 = new ArrayList<>();
        fila1.add(1); fila1.add(2); fila1.add(3);
        tabla.add(fila1);
        
        List<Integer> fila2 = new ArrayList<>();
        fila2.add(4); fila2.add(5); fila2.add(6);
        tabla.add(fila2);

        for (List<Integer> fila : tabla) {
            for (Integer elemento : fila) {
                System.out.print(elemento + "-");
            }
            System.out.print("\n");
        }
    }
}