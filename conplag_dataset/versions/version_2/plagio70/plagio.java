// plagiado_70.java
public class ElevarAPotencia { // Renombrado de clase
    public static void main(String[] args) {
        double b = 2.0; // Renombrado de variable
        int exp = 3; // Cambio de tipo de exponente a int
        double res = 1.0;

        // Implementación manual de potencia usando bucle
        for (int i = 0; i < exp; i++) {
            res *= b;
        }
        System.out.println("Resultado de " + b + "^" + exp + ": " + res); // Cambio de mensaje y formato
    }
}