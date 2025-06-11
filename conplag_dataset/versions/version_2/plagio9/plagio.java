// plagiado_9.java
public class OperacionAdicion {
    public static int calcularSuma(int x, int y) { // Renombrado de método y parámetros
        int res = x;
        res += y; // Operador de asignación compuesta
        return res;
    }

    public static void main(String[] args) {
        int valor = calcularSuma(5, 7);
        System.out.println("El total es: " + valor);
    }
}