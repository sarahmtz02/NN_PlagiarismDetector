// plagiado_23.java
import java.util.TreeMap; // Cambio de implementación de Map
import java.util.Map;

public class ContadorDeTerminos {
    public static void main(String[] args) {
        String cadena = "hola mundo hola";
        Map<String, Integer> conteo = new TreeMap<>(); // Uso de TreeMap
        String[] terminos = cadena.split(" ");

        for (int i = 0; i < terminos.length; i++) { // Bucle for tradicional
            String t = terminos[i];
            if (conteo.containsKey(t)) {
                conteo.put(t, conteo.get(t) + 1);
            } else {
                conteo.put(t, 1);
            }
        }

        conteo.forEach((clave, valor) -> System.out.println("Término: " + clave + ", Conteo: " + valor)); // Uso de forEach con lambda
    }
}