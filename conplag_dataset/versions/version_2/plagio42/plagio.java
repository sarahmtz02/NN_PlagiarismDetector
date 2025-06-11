// plagiado_42.java
import java.util.Optional;

public class ComprobacionDeValor { // Renombrado de clase
    public static void main(String[] args) {
        String valorPosible = "María"; // Renombrado de variable y cambio de valor
        Optional<String> opcionValor = Optional.ofNullable(valorPosible); // Renombrado de objeto

        opcionValor.ifPresentOrElse( // Uso de ifPresentOrElse
            v -> System.out.println("El valor existe: " + v), // Lambda para presente
            () -> System.out.println("No se encontró ningún valor.") // Lambda para no presente
        );
    }
}