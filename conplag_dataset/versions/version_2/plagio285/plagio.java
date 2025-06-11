public class FuncionDeClaseConRetorno {
    public static int calcularProducto(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        int productoObtenido = calcularProducto(5, 3);
        System.out.println("Producto: " + productoObtenido);
    }
}