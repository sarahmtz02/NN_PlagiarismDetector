public class PropagacionDeErrores {
    public static void simularFallo() throws Throwable {
        try {
            String texto = null;
            texto.charAt(0);
        } catch (NullPointerException npe) {
            Throwable nuevaExcepcion = new Throwable("Fallo en la simulación.", npe);
            throw nuevaExcepcion;
        }
    }

    public static void main(String[] args) {
        try {
            simularFallo();
        } catch (Throwable t) {
            System.err.println("Error atrapado: " + t.getMessage());
            if (t.getCause() != null) {
                System.err.println("Origen: " + t.getCause().getLocalizedMessage());
            }
        }
    }
}