public class FuncionConDevolucion {
    public static int adicionar(int x, int y) {
        int sumaTemporal = x;
        sumaTemporal += y;
        return sumaTemporal;
    }

    public static void main(String[] args) {
        int res = adicionar(10, 20);
        System.out.println("El total es: " + res);
    }
}