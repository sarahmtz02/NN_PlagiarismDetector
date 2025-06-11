// original_39.java
public class CalculadoraSimple {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        CalculadoraSimple calc = new CalculadoraSimple();
        System.out.println("Suma: " + calc.sumar(10, 5));
        System.out.println("Resta: " + calc.restar(10, 5));
    }
}