public class DesplegarDatosPersona {
    public static void imprimirDetalles(String pNombre, int pEdad) {
        String mensaje = "El nombre es " + pNombre + " y la edad es " + pEdad + " años.";
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        imprimirDetalles("Pedro", 25);
    }
}