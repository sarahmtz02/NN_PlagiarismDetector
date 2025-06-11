import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodasLasLineasDeArchivo {
    public static void main(String[] args) {
        try {
            List<String> lineas = Files.readAllLines(Paths.get("datos.txt"));
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}