public class SalidaAnticipadaBucle {
    public static void main(String[] args) {
        boolean salirBucleInterno;
        for (int x = 0; x < 3; x++) {
            salirBucleInterno = false;
            int y = 0;
            while (y < 3 && !salirBucleInterno) {
                if (x == 1 && y == 1) {
                    salirBucleInterno = true;
                } else {
                    System.out.println("X: " + x + ", Y: " + y);
                }
                y++;
            }
        }
    }
}