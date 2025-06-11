public class MultiplicacionYAsignacion {
    public static void main(String[] args) {
        int factor = 5;
        int multiplicador = 3;
        int resultado = 0;
        for (int i = 0; i < multiplicador; i++) {
            resultado += factor;
        }
        factor = resultado;
        System.out.println("Valor final de factor: " + factor);
    }
}