import java.util.ArrayList;
import java.util.List;

public class EliminarElementoLista {
    public static void main(String[] args) {
        List<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.remove("Verde");
        System.out.println("Lista después de eliminar: " + colores);
    }
}