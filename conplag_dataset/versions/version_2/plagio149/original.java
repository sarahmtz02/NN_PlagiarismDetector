public class FuncionLambdaSimple {
    interface Operacion {
        int aplicar(int a, int b);
    }

    public static void main(String[] args) {
        Operacion suma = (a, b) -> a + b;
        System.out.println("Resultado lambda: " + suma.aplicar(5, 7));
    }
}