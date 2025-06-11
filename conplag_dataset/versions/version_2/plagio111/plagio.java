import java.util.Random;

public class GeneradorDeNumeros {
    public static void main(String[] args) {
        Random rnd = new Random();
        double valorGenerado = rnd.nextDouble();
        System.out.println("Valor al azar: " + valorGenerado);
    }
}