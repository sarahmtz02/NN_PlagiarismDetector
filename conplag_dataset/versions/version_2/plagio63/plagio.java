// plagiado_63.java
public class CalculoProducto { // Renombrado de clase
    public static void main(String[] args) {
        int factor1 = 5; // Renombrado de variable
        int factor2 = 6; // Renombrado de variable
        int resultadoMultiplicacion = 0;
        // Suma repetida para simular multiplicación
        for (int i = 0; i < factor2; i++) {
            resultadoMultiplicacion += factor1;
        }
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion); // Cambio de mensaje
    }
}