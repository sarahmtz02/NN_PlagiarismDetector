public class FuncionRecursivaSimple {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial de 4: " + factorial(4));
    }
}