// original_7.java
public class InvertirCadena {
    public static void main(String[] args) {
        String original = "Hola";
        String invertida = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        System.out.println("Cadena original: " + original);
        System.out.println("Cadena invertida: " + invertida);
    }
}