// plagiado_54.java
public class CalculoSumaRecursiva { // Renombrado de clase
    public static int obtenerSumatoria(int limite) { // Renombrado de método y parámetro
        if (limite == 0) { // Condición base ligeramente modificada
            return 0;
        }
        return limite + obtenerSumatoria(limite - 1); // Estructura idéntica
    }

    public static void main(String[] args) {
        int valorLimite = 5; // Renombrado de variable
        System.out.println("Sumatoria de 1 a " + valorLimite + ": " + obtenerSumatoria(valorLimite)); // Cambio de mensaje
    }
}