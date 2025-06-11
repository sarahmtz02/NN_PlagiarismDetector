import java.util.Arrays;

public class DuplicarArreglo {
    public static void main(String[] args) {
        int[] fuente = {1, 2, 3};
        int[] duplicado = new int[fuente.length];
        System.arraycopy(fuente, 0, duplicado, 0, fuente.length);
        duplicado[0] = 99;
        System.out.println("Fuente: " + Arrays.toString(fuente));
        System.out.println("Duplicado: " + Arrays.toString(duplicado));
    }
}