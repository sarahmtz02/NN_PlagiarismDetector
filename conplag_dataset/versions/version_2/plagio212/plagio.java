public class ComprobarExtensionArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "imagen.png";
        String extensionEsperada = ".png";
        if (nombreArchivo.regionMatches(nombreArchivo.length() - extensionEsperada.length(), extensionEsperada, 0, extensionEsperada.length())) {
            System.out.println("La extensión del archivo coincide.");
        } else {
            System.out.println("La extensión del archivo no coincide.");
        }
    }
}