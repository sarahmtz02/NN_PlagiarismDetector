import java.util.LinkedList;
import java.util.List;

public class EliminarItemPorPosicion {
    public static void main(String[] args) {
        List<String> simbolos = new LinkedList<>();
        simbolos.add("X");
        simbolos.add("Y");
        simbolos.subList(0, 1).clear();
        System.out.println("Colección modificada: " + simbolos);
    }
}