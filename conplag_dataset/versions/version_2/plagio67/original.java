// original_67.java
import java.util.ArrayList;
import java.util.List;

public class RecorrerLista {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");

        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }
    }
}