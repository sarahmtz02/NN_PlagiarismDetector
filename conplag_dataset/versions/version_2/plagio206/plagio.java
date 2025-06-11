import java.util.Hashtable;
import java.util.Map;

public class TablaDeAsociacion {
    public static void main(String[] args) {
        Map<String, String> paisesCapitales = new Hashtable<>();
        paisesCapitales.put("España", "Madrid");
        paisesCapitales.put("Francia", "París");
        System.out.println("Capital para Francia: " + paisesCapitales.get("Francia"));
    }
}