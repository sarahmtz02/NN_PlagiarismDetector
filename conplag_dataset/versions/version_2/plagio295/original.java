public class MetodoConVarargs {
    public static void imprimirNumeros(int... numeros) {
        for (int num : numeros) {
            System.out.println("Número: " + num);
        }
    }

    public static void main(String[] args) {
        imprimirNumeros(1, 2, 3);
        imprimirNumeros(10, 20);
    }
}