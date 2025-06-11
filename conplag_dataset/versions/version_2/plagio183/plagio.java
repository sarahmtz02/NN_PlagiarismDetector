public class CapturaDeErroresGeneral {
    public static void main(String[] args) {
        try {
            String s = null;
            s.length();
        } catch (Throwable t) {
            System.err.println("Ha ocurrido una excepción de tipo Throwable: " + t.toString());
        }
    }
}