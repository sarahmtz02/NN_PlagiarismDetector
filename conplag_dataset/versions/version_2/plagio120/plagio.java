import java.util.Hashtable;
import java.util.Map;

public class ObtenerValorDeDiccionario {
    public static void main(String[] args) {
        Map<String, Integer> registro = new Hashtable<>();
        registro.put("Alicia", 30);
        registro.put("Roberto", 25);
        
        Integer valorBuscado = registro.get("Alicia");
        System.out.println("Valor para la clave Alicia: " + valorBuscado);
    }
}