public class CapturaDeErrores {
    public static void main(String[] args) {
        String cadena = null;
        try {
            int longitud = cadena.codePointCount(0, cadena.length());
            System.out.println(longitud);
        } catch (RuntimeException e) {
            System.err.println("Se atrapó una RuntimeException.");
        }
    }
}