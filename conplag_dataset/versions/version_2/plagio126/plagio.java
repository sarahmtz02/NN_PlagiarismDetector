public class SerieNumerosFibonacci {
    public static int obtenerTermino(int posicion) {
        if (posicion == 0) {
            return 0;
        } else if (posicion == 1) {
            return 1;
        }
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= posicion; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        int termino = 7;
        System.out.println("Término de Fibonacci en posición " + termino + ": " + obtenerTermino(termino));
    }
}