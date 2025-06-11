public class MetodoConValorPredeterminado {
    public static void mostrar(String contenido) {
        System.out.println(contenido);
    }

    public static void mostrar() {
        mostrar("Texto preestablecido.");
    }

    public static void main(String[] args) {
        mostrar();
        mostrar("Nuevo texto.");
    }
}