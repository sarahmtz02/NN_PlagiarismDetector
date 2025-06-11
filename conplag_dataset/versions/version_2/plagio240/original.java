import java.util.Random;

public class GenerarNumeroAleatorioEntero {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100); // Genera entre 0 y 99
        System.out.println("Número aleatorio: " + numeroAleatorio);
    }
