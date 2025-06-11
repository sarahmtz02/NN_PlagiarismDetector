// plagiado_8.java
import java.util.Vector; // Cambio de tipo de lista
import java.util.List;

public class ColeccionDeEnteros {
    public static void main(String[] args) {
        List<Integer> enteros = new Vector<>();
        enteros.add(10);
        enteros.add(20);
        enteros.add(30);

        for (Integer num : enteros) { // Bucle for-each en lugar de for tradicional
            System.out.println("Valor: " + num);
        }
    }
}