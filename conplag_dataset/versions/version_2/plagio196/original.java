public class MetodoConParametroPrimitivo {
    public static void modificarValor(int val) {
        val = val + 10;
        System.out.println("Dentro del método: " + val);
    }

    public static void main(String[] args) {
        int miValor = 5;
        System.out.println("Antes del método: " + miValor);
        modificarValor(miValor);
        System.out.println("Después del método: " + miValor);
    }
}