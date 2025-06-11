public class PatronDiagonal {
    public static void main(String[] args) {
        int dimension = 3;
        int filaActual = 0;
        while (filaActual < dimension) {
            int columnaActual = 0;
            while (columnaActual < dimension) {
                String caracter = (filaActual == columnaActual) ? "X " : "O ";
                System.out.print(caracter);
                columnaActual++;
            }
            System.out.println();
            filaActual++;
        }
    }
}