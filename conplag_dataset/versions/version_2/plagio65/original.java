// original_65.java
public class ImprimirAsteriscos {
    public static void main(String[] args) {
        int filas = 3;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}