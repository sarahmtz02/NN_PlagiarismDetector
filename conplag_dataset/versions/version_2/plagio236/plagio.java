public class GenerarMensajeTexto {
    public static String construirFrase() {
        StringBuilder sb = new StringBuilder();
        sb.append("Un saludo para todos.");
        return sb.toString();
    }

    public static void main(String[] args) {
        String fraseGenerada = construirFrase();
        System.out.println(fraseGenerada);
    }
}