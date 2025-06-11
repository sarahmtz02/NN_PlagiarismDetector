public class GeneradorDeTexto {
    public static String darCadenaPredeterminada() {
        String texto = "Texto predefinido";
        return texto;
    }

    public static void main(String[] args) {
        String contenido = darCadenaPredeterminada();
        System.out.println("Contenido: " + contenido);
    }
}