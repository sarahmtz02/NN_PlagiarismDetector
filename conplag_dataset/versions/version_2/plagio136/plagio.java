public class GeneradorDeBienvenida {
    public static String construirMensaje(String usuario) {
        StringBuilder sb = new StringBuilder();
        sb.append("Bienvenido, ").append(usuario).append("!");
        return sb.toString();
    }

    public static void main(String[] args) {
        String mensajeFinal = construirMensaje("Pedro");
        System.out.println(mensajeFinal);
    }
}