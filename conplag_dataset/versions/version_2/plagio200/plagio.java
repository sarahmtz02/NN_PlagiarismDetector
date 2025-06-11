public class BloqueFinalDeEjecucion {
    public static void main(String[] args) {
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            System.err.println("Problema: " + e.getLocalizedMessage());
        } finally {
            System.out.println("Este bloque siempre se ejecuta.");
        }
    }
}