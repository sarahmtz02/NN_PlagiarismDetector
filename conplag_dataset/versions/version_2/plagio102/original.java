import java.util.Scanner;

public class CalculadoraSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
        scanner.close();
    }
}