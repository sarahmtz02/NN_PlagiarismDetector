public class IteracionConInterrupcion {
    public static void main(String[] args) {
        int k = 0;
        while (true) {
            if (k == 3) {
                break;
            }
            System.out.println("Valor: " + k);
            k++;
        }
    }
}