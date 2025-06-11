// original_54.java
public class MetodoRecursivoSuma {
    public static int sumarHasta(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumarHasta(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("La suma hasta " + numero + " es: " + sumarHasta(numero));
    }
}