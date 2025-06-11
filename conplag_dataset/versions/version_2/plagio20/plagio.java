// plagiado_20.java
import java.util.concurrent.ThreadLocalRandom; // Uso de ThreadLocalRandom
import java.util.Scanner;

public class JuegoRPS { // Renombrado de clase
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] movimientos = {"roca", "papel", "corte"}; // Renombrado de opciones y valores
        
        System.out.print("Ingresa tu elección (roca, papel, corte): ");
        String eleccionJugador = teclado.nextLine().toLowerCase();

        int indiceMaquina = ThreadLocalRandom.current().nextInt(movimientos.length);
        String eleccionMaquina = movimientos[indiceMaquina];

        System.out.println("Tu elección: " + eleccionJugador);
        System.out.println("Elección de la máquina: " + eleccionMaquina);

        if (eleccionJugador.equals(eleccionMaquina)) {
            System.out.println("¡Empate!");
        } else if ((eleccionJugador.equals("roca") && eleccionMaquina.equals("corte")) ||
                   (eleccionJugador.equals("papel") && eleccionMaquina.equals("roca")) ||
                   (eleccionJugador.equals("corte") && eleccionMaquina.equals("papel"))) {
            System.out.println("¡Ganas!");
        } else {
            System.out.println("¡Pierdes!");
        }
        teclado.close();
    }
}