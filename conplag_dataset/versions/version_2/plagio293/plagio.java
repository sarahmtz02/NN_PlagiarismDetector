import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class EliminarDeColeccion {
    public static void main(String[] args) {
        List<String> frutas = new LinkedList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        
        Iterator<String> it = frutas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Manzana")) {
                it.remove();
            }
        }
        System.out.println("Frutas que quedan: " + frutas);
    }
}