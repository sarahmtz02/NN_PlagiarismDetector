import java.util.Arrays;
import java.util.List;

public class ValorMasGrande {
    public static void main(String[] args) {
        List<Integer> valores = Arrays.asList(10, 5, 20);
        int valorMayor = Integer.MIN_VALUE;
        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i) > valorMayor) {
                valorMayor = valores.get(i);
            }
        }
        System.out.println("El valor más alto es: " + valorMayor);
    }
}