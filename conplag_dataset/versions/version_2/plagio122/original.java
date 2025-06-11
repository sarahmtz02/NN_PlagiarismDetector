public class ManejoDeExcepcionEspecifica {
    public static void main(String[] args) {
        String texto = null;
        try {
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            System.err.println("Se ha producido un NullPointerException.");
        } catch (Exception e) {
            System.err.println("Ocurrió una excepción general.");
        }
    }
}