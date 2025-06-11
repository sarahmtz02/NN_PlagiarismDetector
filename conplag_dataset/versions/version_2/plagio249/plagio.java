public class FuncionConVariasFirmas {
    public static void mostrar(String s) {
        System.out.println("Cadena: " + s);
    }

    public static void mostrar(double d) {
        System.out.println("Doble: " + d);
    }

    public static void main(String[] args) {
        mostrar("Saludos");
        mostrar(45.67);
    }
}