// original_20.java
import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opciones = {"piedra", "papel", "tijeras"};

        System.out.println("Elige tu jugada (piedra, papel, tijeras):");
        String jugadaUsuario = scanner.nextLine().toLowerCase();

        int indiceComputadora = random.nextInt(opciones.length);
        String jugadaComputadora = opciones[indiceComputadora];

        System.out.println("Tú elegiste: " + jugadaUsuario);
        System.out.println("La computadora eligió: " + jugadaComputadora);

        if (jugadaUsuario.equals(jugadaComputadora)) {
            System.out.println("¡Es un empate!");
        } else if ((jugadaUsuario.equals("piedra") && jugadaComputadora.equals("tijeras")) ||
                   (jugadaUsuario.equals("papel") && jugadaComputadora.equals("piedra")) ||
                   (jugadaUsuario.equals("tijeras") && jugadaComputadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }
        scanner.close();
    }
}