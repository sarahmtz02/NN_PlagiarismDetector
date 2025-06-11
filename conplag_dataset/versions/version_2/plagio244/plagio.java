import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class IterarTablaHash {
    public static void main(String[] args) {
        Map<String, String> configuracion = new Hashtable<>();
        configuracion.put("opcionA", "config1");
        configuracion.put("opcionB", "config2");
        
        Set<String> claves = configuracion.keySet();
        Iterator<String> it = claves.iterator();
        while (it.hasNext()) {
            String clave = it.next();
            System.out.println("Item: " + clave + " = " + configuracion.get(clave));
        }
    }
}