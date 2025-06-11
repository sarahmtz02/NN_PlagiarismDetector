public class TotalAcumulado {
    public static void main(String[] args) {
        int acumulador = 0;
        int contador = 1;
        while (contador <= 5) {
            acumulador = acumulador + contador;
            contador = contador + 1;
        }
        System.out.println("El total es: " + acumulador);
    }
}