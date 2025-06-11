public class ResultadoDivision {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        int contador = 0;
        while (num1 >= num2) {
            num1 -= num2;
            contador++;
        }
        System.out.println("El resultado de la división es: " + contador);
    }
}