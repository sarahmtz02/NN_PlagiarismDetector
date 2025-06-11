public class ClaseInternaEstatica {
    static class Helper {
        static void mostrarAyuda() {
            System.out.println("Ayuda desde la clase interna estática.");
        }
    }

    public static void main(String[] args) {
        ClaseInternaEstatica.Helper.mostrarAyuda();
    }
}