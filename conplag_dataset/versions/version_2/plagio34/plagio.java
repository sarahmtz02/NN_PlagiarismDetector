// plagiado_34.java
public class DeterminarMayorMenor { // Renombrado de clase
    public static void main(String[] args) {
        int val1 = 10; // Renombrado de variable
        int val2 = 20; // Renombrado de variable
        String resultadoComparacion;

        if (val1 < val2) { // Inversión de la primera condición
            resultadoComparacion = "El segundo valor es mayor";
        } else if (val1 == val2) { // Cambio de orden y condición
            resultadoComparacion = "Los valores son idénticos";
        } else {
            resultadoComparacion = "El primer valor es mayor";
        }
        System.out.println(resultadoComparacion); // Mensaje conciso
    }
}