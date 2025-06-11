public class CalculoFactorialIterativo {
    public static int obtenerProducto(int numero) {
        int res = 1;
        for (int i = 1; i <= numero; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Producto factorial de 4: " + obtenerProducto(4));
    }
}