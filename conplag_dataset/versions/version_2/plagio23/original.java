// original_23.java
import java.util.HashMap;
import java.util.Map;

public class ConteoPalabras {
    public static void main(String[] args) {
        String texto = "hola mundo hola";
        Map<String, Integer> frecuencia = new HashMap<>();
        String[] palabras = texto.split(" ");

        for (String palabra : palabras) {
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frecuencia.entrySet()) {
            System.out.println("Palabra: " + entry.getKey() + ", Frecuencia: " + entry.getValue());
        }
    }
}