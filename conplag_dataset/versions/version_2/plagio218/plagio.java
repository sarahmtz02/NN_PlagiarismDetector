import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformarElementosColeccion {
    public static void main(String[] args) {
        List<String> valores = Arrays.asList("X", "Y");
        List<String> valoresTransformados = valores.stream()
                                                    .map(v -> v.equals("X") ? "Nuevo X" : v)
                                                    .collect(Collectors.toList());
        System.out.println("Valores transformados: " + valoresTransformados);
    }
}