public class ImprimirPatronAsteriscos {
    public static void main(String[] args) {
        int tamaño = 4;
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}