// plagiado_53.java
public class ManipulacionDeDatos { // Renombrado de clase
    public static void main(String[] args) {
        Integer numeroEntero = 10; // Uso de wrapper class
        Double numeroDecimal = numeroEntero.doubleValue(); // Uso de método wrapper
        System.out.println("De int a double: " + numeroDecimal); // Cambio de mensaje

        Double valorConDecimal = 15.7; // Renombrado de variable
        int valorSinDecimal = valorConDecimal.intValue(); // Uso de método wrapper
        System.out.println("De double a int: " + valorSinDecimal); // Cambio de mensaje
    }
}