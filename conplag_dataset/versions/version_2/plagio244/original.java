import java.util.HashMap;
import java.util.Map;

public class RecorrerHashMap {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("clave1", "valor1");
        diccionario.put("clave2", "valor2");
        for (Map.Entry<String, String> entrada : diccionario.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
    }
}