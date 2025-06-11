// plagiado_10.java
public class CalculoFactorial {
    public static int obtenerFactorial(int numero) { // Renombrado de método y parámetro
        if (numero == 1 || numero == 0) { // Condición base ligeramente modificada
            return 1;
        }
        return numero * obtenerFactorial(numero - 1);
    }

    public static void main(String[] args) {
        int valor = 5;
        int res = obtenerFactorial(valor);
        System.out.println("Factorial de " + valor + ": " + res);
    }
}