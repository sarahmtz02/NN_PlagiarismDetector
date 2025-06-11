import java.util.Arrays;
import java.util.List;

public class ObtenerElementoEnPosicion {
    public static void main(String[] args) {
        String[] vegetales = {"Zanahoria", "Pepino"};
        List<String> listaVegetales = Arrays.asList(vegetales);
        String primerVegetal = null;
        if (listaVegetales.size() > 0) {
            primerVegetal = listaVegetales.toArray(new String[0])[0];
        }
        System.out.println("El primer vegetal es: " + primerVegetal);
    }
}