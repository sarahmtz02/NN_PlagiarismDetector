// plagiado_74.java
public class CocienteEntero { // Renombrado de clase
    public static void main(String[] args) {
        int dividendo = 10; // Renombrado de variable
        int divisor = 3; // Renombrado de variable
        int cociente = 0;
        int tempDividendo = dividendo;

        // Simulación de división entera mediante restas sucesivas
        while (tempDividendo >= divisor) {
            tempDividendo -= divisor;
            cociente++;
        }
        System.out.println("El cociente sin residuo es: " + cociente); // Cambio de mensaje
    }
}