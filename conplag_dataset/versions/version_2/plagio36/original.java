// original_36.java
public class ValidarNumeroPositivo {
    public static void main(String[] args) {
        int num = -5;
        if (num > 0) {
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
}