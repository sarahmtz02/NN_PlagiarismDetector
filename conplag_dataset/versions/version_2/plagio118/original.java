public class ExcepcionGenerica {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.err.println("Error: División por cero.");
        }
    }
}