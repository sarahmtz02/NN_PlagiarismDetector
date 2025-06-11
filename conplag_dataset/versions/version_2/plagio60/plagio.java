// plagiado_60.java
public class CicloDentroDeOtro { // Renombrado de clase
    public static void main(String[] args) {
        int contadorExterior = 1; // Uso de while anidado
        while (contadorExterior <= 3) {
            int contadorInterior = 1;
            while (contadorInterior <= 2) {
                System.out.printf("Exterior: %d, Interior: %d%n", contadorExterior, contadorInterior); // Uso de printf
                contadorInterior++;
            }
            contadorExterior++;
        }
    }
}