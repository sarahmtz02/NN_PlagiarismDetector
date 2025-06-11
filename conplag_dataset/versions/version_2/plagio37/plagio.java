// plagiado_37.java
import java.io.Console; // Uso de Console en lugar de Scanner

public class InteraccionUsuario { // Renombrado de clase
    public static void main(String[] args) {
        Console consola = System.console();
        if (consola != null) {
            String usuario = consola.readLine("Por favor, escribe tu nombre: "); // Mensaje y renombrado
            consola.printf("Saludos, %s.\n", usuario); // Uso de printf
        } else {
            System.out.println("No se pudo obtener la consola.");
        }
    }
}