import java.util.Arrays;
import java.util.List;

public class MostrarContenidoArreglo {
    public static void main(String[] args) {
        String[] componentes = {"A", "B", "C"};
        List<String> listaComponentes = Arrays.asList(componentes);
        for (int i = 0; i < listaComponentes.size(); i++) {
            System.out.println(listaComponentes.get(i));
        }
    }
}