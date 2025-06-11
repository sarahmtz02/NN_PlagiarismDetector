public class PasoPorValorEntero {
    public static void ajustarNumero(int numeroOriginal) {
        numeroOriginal = numeroOriginal * 2;
        System.out.println("Al interior de la función: " + numeroOriginal);
    }

    public static void main(String[] args) {
        int miNumero = 5;
        System.out.println("Antes de la función: " + miNumero);
        ajustarNumero(miNumero);
        System.out.println("Después de la función: " + miNumero);
    }
}