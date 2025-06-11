public class IteracionesDobles {
    public static void main(String[] args) {
        int cont1 = 0;
        while (cont1 < 2) {
            int cont2 = 0;
            while (cont2 < 2) {
                System.out.println("Contador X: " + cont1 + ", Contador Y: " + cont2);
                cont2++;
            }
            cont1++;
        }
    }
}