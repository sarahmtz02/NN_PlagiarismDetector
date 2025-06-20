// original_10.java
public class FactorialRecursivo {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int resultado = factorial(num);
        System.out.println("El factorial de " + num + " es: " + resultado);
    }
}