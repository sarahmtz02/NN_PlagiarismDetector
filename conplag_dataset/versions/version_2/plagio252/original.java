public class StringContainsIgnoreCaseAndSpaces {
    public static void main(String[] args) {
        String textoLargo = "   Este ES un TEXTO de prueba   ";
        String buscar = "texto";
        if (textoLargo.trim().toLowerCase().contains(buscar.toLowerCase())) {
            System.out.println("El texto contiene la palabra, ignorando mayúsculas y espacios.");
        } else {
            System.out.println("El texto no contiene la palabra.");
        }
    }
}