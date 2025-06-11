public class FuncionDeVerificacion {
    public static String verificarEsMayorQueCero(int valor) {
        if (valor > 0) {
            return "El valor es mayor que cero.";
        } else {
            return "El valor no es mayor que cero.";
        }
    }

    public static void main(String[] args) {
        System.out.println(verificarEsMayorQueCero(10));
        System.out.println(verificarEsMayorQueCero(-5));
    }
}