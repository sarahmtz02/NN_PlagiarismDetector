import java.util.ArrayList;
import java.util.List;

public class ClasificarElementos {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>();
        valores.add(5);
        valores.add(2);
        valores.add(8);

        // Algoritmo de burbuja para ordenar
        int n = valores.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (valores.get(j) > valores.get(j + 1)) {
                    int temp = valores.get(j);
                    valores.set(j, valores.get(j + 1));
                    valores.set(j + 1, temp);
                }
            }
        }
        System.out.println("Valores clasificados: " + valores);
    }
}