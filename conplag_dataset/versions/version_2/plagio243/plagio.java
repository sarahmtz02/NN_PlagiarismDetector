public class IteracionConMultiplesCriterios {
    public static void main(String[] args) {
        int contador1 = 0;
        int contador2 = 5;
        for (; contador1 < 3 && contador2 > 2; ) {
            System.out.println("Contador A: " + contador1 + ", Contador B: " + contador2);
            contador1++;
            contador2--;
        }
    }
}