public class MostrarDiferentesTipos {
    public static void desplegar(String contenido) {
        System.out.println("Mensaje: " + contenido);
    }

    public static void desplegar(double valor) {
        System.out.println("Valor decimal: " + valor);
    }

    public static void main(String[] args) {
        desplegar("Adiós");
        desplegar(456.78);
    }
}