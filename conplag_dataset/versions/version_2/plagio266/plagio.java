import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class RemoverFicheroDelSistema {
    public static void main(String[] args) {
        Path rutaFichero = Paths.get("fichero_temporal.tmp");
        // Para que el ejemplo funcione, vamos a crear el archivo primero
        try {
            Files.createFile(rutaFichero);
            System.out.println("Fichero temporal creado para demostración.");
        } catch (IOException e) {
            System.err.println("No se pudo crear el fichero temporal: " + e.getMessage());
        }

        if (Files.exists(rutaFichero)) {
            try {
                Files.delete(rutaFichero);
                System.out.println("Fichero removido con éxito.");
            } catch (IOException e) {
                System.err.println("Falló la eliminación del fichero: " + e.getMessage());
            }
        } else {
            System.out.println("El fichero no se encuentra.");
        }
    }
}