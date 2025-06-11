// plagiado_18.java
public class ManejoExcepciones {
    public static void main(String[] args) {
        try {
            int numerador = 10;
            int denominador = 0;
            int cociente = numerador / denominador; // Provoca una excepción
            System.out.println("El cociente es: " + cociente);
        } catch (Exception ex) { // Captura de excepción más genérica
            System.out.println("Ha ocurrido un problema: " + ex.getMessage());
        }
    }
}