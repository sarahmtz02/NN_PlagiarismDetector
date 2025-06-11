// original_71.java
public class FactorialIterativo {
    public static int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("El factorial de " + num + " es: " + calcularFactorial(num));
    }
}