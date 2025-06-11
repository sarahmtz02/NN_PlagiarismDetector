import java.util.LinkedHashMap;
import java.util.Map;

public class VerificarExistenciaDeClave {
    public static void main(String[] args) {
        Map<String, String> ajustes = new LinkedHashMap<>();
        ajustes.put("idioma", "español");
        
        boolean encontrado = false;
        for (String clave : ajustes.keySet()) {
            if (clave.equals("idioma")) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("La clave de idioma está presente.");
        } else {
            System.out.println("La clave de idioma no está presente.");
        }
    }
}