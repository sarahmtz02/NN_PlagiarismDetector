// plagiado_75.java
public class MostrarSoloPares { // Renombrado de clase
    public static void main(String[] args) {
        int numeroActual = 1; // Inicio en 1
        while (numeroActual <= 10) {
            if (numeroActual % 2 == 0) { // Verificación de paridad
                System.out.println(numeroActual);
            }
            numeroActual++;
        }
    }
}