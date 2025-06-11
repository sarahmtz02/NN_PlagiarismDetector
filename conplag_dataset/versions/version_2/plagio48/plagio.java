// plagiado_48.java
public class CicloRepetirHasta { // Renombrado de clase
    public static void main(String[] args) {
        int iterador = 0; // Renombrado de variable
        while (true) { // Bucle while true con condición de salida interna
            System.out.println("Iteración: " + iterador); // Cambio de mensaje
            iterador++;
            if (iterador >= 3) {
                break; // Salida condicional
            }
        }
    }
}