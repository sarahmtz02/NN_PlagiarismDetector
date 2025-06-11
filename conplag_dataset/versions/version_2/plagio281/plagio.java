public class ModuloYAsignacion {
    public static void main(String[] args) {
        int valor = 17;
        int divisor = 5;
        int resultadoModulo = valor - (valor / divisor) * divisor;
        valor = resultadoModulo;
        System.out.println("Valor después de operación módulo: " + valor);
    }
}