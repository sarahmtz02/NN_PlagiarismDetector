public class CicloSinFinControlado {
    public static void main(String[] args) {
        int iter = 0;
        for (;;) {
            System.out.println("Paso: " + iter);
            iter++;
            if (iter > 4) {
                System.exit(0);
            }
        }
    }
}