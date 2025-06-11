public class UsoDeInterfazFuncionalSimple {
    @FunctionalInterface
    interface Operacion {
        int aplicar(int a, int b);
    }

    public static void main(String[] args) {
        Operacion suma = (a, b) -> a + b;
        System.out.println("Suma: " + suma.aplicar(5, 3));
    }
}