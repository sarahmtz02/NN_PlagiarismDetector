public class ManejoDeStringsEnBlanco {
    public static void main(String[] args) {
        String texto = "   espacios   ";
        String sinEspacios = texto.trim();
        System.out.println("Sin espacios: '" + sinEspacios + "'");
    }
}