public class ObtenerEnteroAlAzar {
    public static void main(String[] args) {
        // Usar Math.random() para simular Random.nextInt()
        int valorAleatorio = (int) (Math.random() * 100); // Genera entre 0 y 99
        System.out.println("Valor al azar: " + valorAleatorio);
    }
}