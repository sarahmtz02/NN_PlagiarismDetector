public class AcumuladorDeNumeros {
    public static void main(String[] args) {
        int acumulador = 0;
        int k = 1;
        while (k <= 3) {
            acumulador = acumulador + k;
            k = k + 1;
        }
        System.out.println("Valor acumulado: " + acumulador);
    }
}