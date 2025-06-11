// plagiado_35.java
public class AcumuladorImpares { // Renombrado de clase
    public static void main(String[] args) {
        int total = 0; // Renombrado de variable
        for (int k = 0; k <= 10; k++) { // Itera sobre todos los números
            if (k % 2 != 0) { // Condición para impares dentro del bucle
                total = total + k;
            }
        }
        System.out.println("Total de números impares hasta diez: " + total); // Cambio de mensaje
    }
}