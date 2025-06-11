// original_53.java
public class ConversionDeTipos {
    public static void main(String[] args) {
        int entero = 10;
        double decimal = (double) entero; // Casting explícito
        System.out.println("Entero a decimal: " + decimal);

        double otroDecimal = 15.7;
        int otroEntero = (int) otroDecimal; // Casting explícito
        System.out.println("Decimal a entero: " + otroEntero);
    }
}