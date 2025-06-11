import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearYEscribirArchivoSimple {
    public static void main(String[] args) {
        String contenido = "Este es un texto de prueba para el archivo.";
        try (FileWriter writer = new FileWriter("nuevo_archivo.txt")) {
            writer.write(contenido);
            System.out.println("Archivo 'nuevo_archivo.txt' creado y escrito.");
        } catch (IOException e) {
            System.err.println("Error al crear/escribir el archivo: " + e.getMessage());
        }
    }
}