public class InvertirCadena {
    public static void main(String[] args) {
        String original = "Hola";
        String invertida = new StringBuilder(original).reverse().toString();
        System.out.println("Cadena invertida: " + invertida);
    }
}