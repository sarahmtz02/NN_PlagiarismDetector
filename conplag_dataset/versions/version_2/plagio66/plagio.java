// plagiado_66.java
public class DatosInmutables { // Renombrado de clase
    public static final int DATO_FIJO = 10; // Renombrado de constante estática
    public final String TEXTO_INVARIABLE; // Renombrado de constante de instancia

    public DatosInmutables() {
        TEXTO_INVARIABLE = "Contenido invariable"; // Cambio de contenido
    }

    public static void main(String[] args) {
        DatosInmutables instancia = new DatosInmutables();
        System.out.println("El dato es: " + DatosInmutables.DATO_FIJO); // Acceso con nombre de clase
        System.out.println("El texto es: " + instancia.TEXTO_INVARIABLE); // Cambio de mensaje
    }
}