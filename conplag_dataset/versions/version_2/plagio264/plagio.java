public class IterarArrayCompleto {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30};
        int contador = 0;
        while (contador < valores.length) {
            System.out.println("Valor del índice " + contador + ": " + valores[contador]);
            contador++;
        }
    }
}