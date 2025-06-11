// original_18.java
public class TryCatchBasico {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Provoca una excepción
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        }
    }
}