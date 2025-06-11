public class ClaseConMetodosStaticos {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static String obtenerMensaje() {
        return "Este es un mensaje estático.";
    }

    public static void main(String[] args) {
        System.out.println("Suma: " + sumar(5, 3));
        System.out.println(obtenerMensaje());
    }
}