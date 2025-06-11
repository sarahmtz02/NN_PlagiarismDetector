import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirTextoEnArchivo {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("salida.txt"))) {
            writer.println("Primera línea de texto.");
            writer.print("Segunda línea.");
        } catch (IOException e) {
            System.err.println("Error al escribir: " + e.getMessage());
        }
    }
}