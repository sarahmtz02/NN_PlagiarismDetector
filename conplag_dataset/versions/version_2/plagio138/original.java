import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionArrayAListaVariacion {
    public static void main(String[] args) {
        String[] nombresArray = {"Ana", "Luis"};
        List<String> nombresLista = new ArrayList<>(Arrays.asList(nombresArray));
        System.out.println("Lista de nombres: " + nombresLista);
    }
}