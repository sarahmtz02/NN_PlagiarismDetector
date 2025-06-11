import java.io.Console;

public class RecibirNombreConsola {
    public static void main(String[] args) {
        Console consola = System.console();
        if (consola != null) {
            String usuario = consola.readLine("Por favor, introduce tu nombre: ");
            consola.printf("Saludos, %s!%n", usuario);
        } else {
            System.err.println("Consola no disponible.");
        }
    }
}