public class CapturaDeVariosErrores {
    public static void main(String[] args) {
        try {
            String s = null;
            s.length(); // NullPointerException
            Integer.parseInt("abc"); // NumberFormatException
        } catch (Exception e) { // Captura genérica, pero se podría refinar
            if (e instanceof NullPointerException) {
                System.err.println("Error de referencia nula: " + e.getMessage());
            } else if (e instanceof NumberFormatException) {
                System.err.println("Error de formato de número: " + e.getMessage());
            } else {
                System.err.println("Error desconocido: " + e.getMessage());
            }
        }
    }
}