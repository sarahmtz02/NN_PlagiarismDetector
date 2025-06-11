// original_56.java
public class ManejoDeStrings {
    public static void main(String[] args) {
        String textoOriginal = "Java Programming";
        String subCadena = textoOriginal.substring(0, 4); // "Java"
        String reemplazado = textoOriginal.replace("Programming", "Development");
        System.out.println("Subcadena: " + subCadena);
        System.out.println("Reemplazado: " + reemplazado);
    }
}