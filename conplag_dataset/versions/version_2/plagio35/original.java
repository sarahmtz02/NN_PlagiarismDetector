// original_35.java
public class SumaImparesBucle {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 10; i += 2) { // Solo itera sobre impares
            suma += i;
        }
        System.out.println("Suma de impares hasta 10: " + suma);
    }
}