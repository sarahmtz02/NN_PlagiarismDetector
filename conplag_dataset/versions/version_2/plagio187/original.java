import java.util.HashSet;
import java.util.Set;

public class SetDeStrings {
    public static void main(String[] args) {
        Set<String> colores = new HashSet<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Rojo"); // No se añade
        System.out.println("Colores en el set: " + colores);
    }
}