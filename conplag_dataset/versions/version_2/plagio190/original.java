public class UsoDeLongParaContador {
    public static void main(String[] args) {
        long contador = 0L;
        for (int i = 0; i < 100000; i++) {
            contador++;
        }
        System.out.println("Contador final: " + contador);
    }
}