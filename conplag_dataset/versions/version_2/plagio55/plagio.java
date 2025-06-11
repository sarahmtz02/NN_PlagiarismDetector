// plagiado_55.java
import java.util.Arrays; // Importación para uso de Streams
import java.util.OptionalInt; // Importación para OptionalInt

public class LocalizadorDeValor { // Renombrado de clase
    public static void main(String[] args) {
        int[] elementos = {10, 20, 30, 40, 50}; // Renombrado de array
        int valorObjetivo = 30; // Renombrado de variable

        // Uso de Streams API para buscar
        OptionalInt resultadoBusqueda = Arrays.stream(elementos)
                                             .filter(n -> n == valorObjetivo)
                                             .findFirst();

        if (resultadoBusqueda.isPresent()) {
            System.out.println("El valor " + valorObjetivo + " se localizó."); // Cambio de mensaje
        } else {
            System.out.println("El valor " + valorObjetivo + " no se encontró."); // Cambio de mensaje
        }
    }
}