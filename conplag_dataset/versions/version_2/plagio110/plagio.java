import java.util.Arrays;
import java.util.List;

public class ClasificarNumeros {
    public static void main(String[] args) {
        Integer[] arrayDeNumeros = {5, 2, 8};
        
        for (int i = 0; i < arrayDeNumeros.length - 1; i++) {
            for (int j = 0; j < arrayDeNumeros.length - 1 - i; j++) {
                if (arrayDeNumeros[j] > arrayDeNumeros[j + 1]) {
                    int temp = arrayDeNumeros[j];
                    arrayDeNumeros[j] = arrayDeNumeros[j + 1];
                    arrayDeNumeros[j + 1] = temp;
                }
            }
        }
        List<Integer> listaOrdenada = Arrays.asList(arrayDeNumeros);
        System.out.println("Colección clasificada: " + listaOrdenada);
    }
}