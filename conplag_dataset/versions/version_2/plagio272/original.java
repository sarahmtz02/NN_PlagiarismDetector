public class StringReplaceAllRegex {
    public static void main(String[] args) {
        String texto = "Uno dos tres cuatro";
        String nuevoTexto = texto.replaceAll("\\s+", "-"); // Reemplaza uno o más espacios por guiones
        System.out.println("Texto con guiones: " + nuevoTexto);
    }
}