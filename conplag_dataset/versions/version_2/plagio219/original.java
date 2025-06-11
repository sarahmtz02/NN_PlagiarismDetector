public class MetodoConRetornoBooleano {
    public static boolean esPositivo(int numero) {
        return numero > 0;
    }

    public static void main(String[] args) {
        if (esPositivo(10)) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número no es positivo.");
        }
    }
}