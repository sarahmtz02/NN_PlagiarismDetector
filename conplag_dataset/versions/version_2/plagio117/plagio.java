import java.util.Arrays;

public class MediaAritmetica {
    public static void main(String[] args) {
        int[] puntos = {80, 90, 75, 95};
        double total = 0;
        int k = 0;
        while (k < puntos.length) {
            total = total + puntos[k];
            k++;
        }
        double media = total / puntos.length;
        System.out.printf("La media aritmética es: %.2f%n", media);
    }
}