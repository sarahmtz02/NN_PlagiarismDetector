public class UtilidadAnidada {
    static class Modulo {
        static void ejecutarModulo() {
            System.out.println("Función de módulo estático ejecutada.");
        }
    }

    public static void main(String[] args) {
        UtilidadAnidada.Modulo.ejecutarModulo();
    }
}