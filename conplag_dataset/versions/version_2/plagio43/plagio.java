// plagiado_43.java
public class GestorDeDatosInternos { // Renombrado de clase
    private int datoPrivado = 100; // Renombrado de atributo

    private void mostrarDatoOculto() { // Renombrado de método privado
        System.out.println("Dato almacenado: " + datoPrivado); // Cambio de mensaje
    }

    public void iniciarVisualizacion() { // Renombrado de método público
        mostrarDatoOculto(); // Invocación del método renombrado
    }

    public static void main(String[] args) {
        GestorDeDatosInternos instancia = new GestorDeDatosInternos();
        instancia.iniciarVisualizacion();
    }
}