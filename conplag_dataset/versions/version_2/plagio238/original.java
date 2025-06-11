public class StringContainsIgnoreCase {
    public static void main(String[] args) {
        String texto = "Hola JAVA";
        if (texto.toLowerCase().contains("java")) {
            System.out.println("Contiene 'java' ignorando mayúsculas/minúsculas.");
        } else {
            System.out.println("No contiene 'java'.");
        }
    }
}