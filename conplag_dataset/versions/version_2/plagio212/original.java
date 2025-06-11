public class StringEndsWithCheck {
    public static void main(String[] args) {
        String archivo = "documento.pdf";
        if (archivo.endsWith(".pdf")) {
            System.out.println("El archivo es un PDF.");
        } else {
            System.out.println("El archivo no es un PDF.");
        }
    }
}