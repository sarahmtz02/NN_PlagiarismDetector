// plagiado_62.java
import java.util.Objects; // Uso de Objects.nonNull

public class VerificadorDeNulos { // Renombrado de clase
    public static void main(String[] args) {
        String miCadena = null; // Renombrado de variable

        if (Objects.nonNull(miCadena)) { // Uso de Objects.nonNull
            System.out.println("El tamaño es: " + miCadena.length()); // Cambio de mensaje
        } else {
            System.out.println("La cadena de texto es nula."); // Cambio de mensaje
        }
    }
}