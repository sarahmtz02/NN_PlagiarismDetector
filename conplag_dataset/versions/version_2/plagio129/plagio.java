public class UtileriasCalculoTexto {
    public static int totalizar(int x, int y) {
        return x + y;
    }

    public static String generarFrase() {
        return "Frase generada estáticamente.";
    }

    public static void main(String[] args) {
        System.out.println("Resultado de la suma: " + UtileriasCalculoTexto.totalizar(5, 3));
        System.out.println(UtileriasCalculoTexto.generarFrase());
    }
}