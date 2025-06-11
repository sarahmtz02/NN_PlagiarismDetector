public class CapturaDeFallo {
    public static void main(String[] args) {
        try {
            int numerador = 10;
            int denominador = 0;
            if (denominador == 0) {
                throw new ArithmeticException("¡No se puede dividir por cero!");
            }
            int cociente = numerador / denominador;
            System.out.println(cociente);
        } catch (Exception ex) {
            System.err.println("Se ha producido un problema: " + ex.getMessage());
        }
    }
}