// original_21.java
public class FibonacciRecursivo {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci de " + n + " es: " + fibonacci(n));
    }
}