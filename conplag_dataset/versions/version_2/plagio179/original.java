import java.util.ArrayList;
import java.util.List;

public class RemoverElementoPorIndice {
    public static void main(String[] args) {
        List<String> letras = new ArrayList<>();
        letras.add("A");
        letras.add("B");
        letras.remove(0);
        System.out.println("Lista resultante: " + letras);
    }
}