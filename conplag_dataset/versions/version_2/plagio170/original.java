import java.util.Arrays;

public class CopiarArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copia = Arrays.copyOf(original, original.length);
        copia[0] = 99;
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copia: " + Arrays.toString(copia));
    }
}