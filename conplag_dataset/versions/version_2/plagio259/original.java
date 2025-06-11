public class ExcepcionCustomizada {
    static class MiExcepcion extends Exception {
        public MiExcepcion(String mensaje) {
            super(mensaje);
        }
    }

    public static void lanzarError() throws MiExcepcion {
        throw new MiExcepcion("Esto es una excepción personalizada.");
    }

    public static void main(String[] args) {
        try {
            lanzarError();
        } catch (MiExcepcion e) {
            System.err.println("Capturada mi excepción: " + e.getMessage());
        }
    }
}