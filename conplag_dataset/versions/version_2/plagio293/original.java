import java.util.ArrayList;
import java.util.List;

public class RemoverElementoDeLista {
    public static void main(String[] args) {
        List<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.remove("Rojo");
        System.out.println("Colores restantes: " + colores);
    }
}