public class CalcularTotalArray {
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5};
        int total = 0;
        int i = 0;
        while (i < valores.length) {
            total = total + valores[i];
            i++;
        }
        System.out.println("Total de elementos: " + total);
    }
}