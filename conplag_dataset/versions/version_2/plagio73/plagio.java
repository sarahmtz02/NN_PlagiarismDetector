// plagiado_73.java
public class ObjetoConInicializacion { // Renombrado de clase
    private String cadenaContenida; // Renombrado de atributo

    public ObjetoConInicializacion(String datoDeInicio) { // Renombrado de constructor y parámetro
        cadenaContenida = datoDeInicio; // Asignación sin 'this'
    }

    public void desplegarContenido() { // Renombrado de método
        System.out.println("Contenido: " + cadenaContenida); // Cambio de mensaje
    }

    public static void main(String[] args) {
        ObjetoConInicializacion instancia = new ObjetoConInicializacion("Un nuevo saludo."); // Cambio de mensaje de instancia
        instancia.desplegarContenido();
    }
}