import java.util.stream.IntStream;

public class SumaConStream {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int suma = IntStream.of(numeros).sum();
        System.out.println("Suma usando stream: " + suma);
    }
}