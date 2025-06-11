public class ManejoDeExcepcionConCausa {
    public static void lanzarExcepcion() throws Exception {
        try {
            Integer.parseInt("no_es_numero");
        } catch (NumberFormatException e) {
            throw new Exception("Error al parsear número.", e);
        }
    }

    public static void main(String[] args) {
        try {
            lanzarExcepcion();
        } catch (Exception e) {
            System.err.println("Capturada: " + e.getMessage());
            if (e.getCause() != null) {
                System.err.println("Causa: " + e.getCause().getMessage());
            }
        }
    }
}