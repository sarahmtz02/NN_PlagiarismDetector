public class MetodoConRetorno {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = sumar(10, 20);
        System.out.println("La suma es: " + resultado);
    }
}