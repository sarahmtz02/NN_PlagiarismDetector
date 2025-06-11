public class ManejoDeFalloPersonalizado {
    static class ErrorApp extends RuntimeException {
        public ErrorApp(String razon) {
            super(razon);
        }
    }

    public static void provocarFallo() {
        // En un caso real, esto sería una condición de error
        throw new ErrorApp("Se ha detectado un problema interno.");
    }

    public static void main(String[] args) {
        try {
            provocarFallo();
        } catch (ErrorApp e) {
            System.err.println("Se ha producido un error de la aplicación: " + e.getLocalizedMessage());
        }
    }
}