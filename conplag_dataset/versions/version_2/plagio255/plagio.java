public class ConstanteDeClase {
    private static final String ID_SISTEMA = "SYS_PROD_001";

    public static String obtenerId() {
        return ID_SISTEMA;
    }

    public static void main(String[] args) {
        System.out.println("Identificador del sistema: " + ConstanteDeClase.obtenerId());
    }
}