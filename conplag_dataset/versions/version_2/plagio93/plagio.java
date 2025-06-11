public class TotalizacionConBucle {
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5};
        int acumulador = 0;
        for (int i = 0; i < valores.length; i++) {
            acumulador += valores[i];
        }
        System.out.println("Total mediante bucle: " + acumulador);
    }
}