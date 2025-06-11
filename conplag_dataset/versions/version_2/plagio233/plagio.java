public class RepeticionConCierre {
    public static void main(String[] args) {
        for (int k = 0; ; k++) {
            System.out.println("Iteración: " + k);
            if (k >= 2) {
                return; // Salir del método main, terminando el programa
            }
        }
    }
}