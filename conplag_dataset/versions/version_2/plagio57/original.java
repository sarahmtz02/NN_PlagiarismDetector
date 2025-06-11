// original_57.java
public class ContadorVocales {
    public static void main(String[] args) {
        String frase = "murcielago";
        int contador = 0;
        for (char c : frase.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("Número de vocales: " + contador);
    }
}