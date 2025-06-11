public class SaludoPersonalizado {
    public static void mostrarMensaje(String usuario) {
        System.out.print("Saludos, ");
        System.out.print(usuario);
        System.out.println("!");
    }

    public static void main(String[] args) {
        mostrarMensaje("Visitante");
    }
}