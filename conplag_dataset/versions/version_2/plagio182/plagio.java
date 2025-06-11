import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InicializarColeccion {
    public static void main(String[] args) {
        List<String> datos = new ArrayList<>();
        Collections.addAll(datos, "Dato1", "Dato2");
        System.out.println("Datos: " + datos);
    }
}