import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtraerSegmentoLista {
    public static void main(String[] args) {
        List<String> elementos = Arrays.asList("A", "B", "C", "D");
        List<String> segmento = elementos.stream()
                                    .skip(1)
                                    .limit(2)
                                    .collect(Collectors.toList());
        System.out.println("Segmento extraído: " + segmento);
    }
}