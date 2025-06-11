// original_31.java
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivoSimple {
    public static void main(String[] args) {
        String contenido = "Este es un texto de ejemplo.";
        try {
            FileWriter writer = new FileWriter("salida.txt");
            writer.write(contenido);
            writer.close();
            System.out.println("Archivo 'salida.txt' creado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}