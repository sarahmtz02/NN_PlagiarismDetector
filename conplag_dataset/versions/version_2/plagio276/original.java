import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivoLineaPorLinea {
    public static void main(String[] args) {
        File archivo = new File("entrada.txt");
        try (Scanner scanner = new Scanner(archivo)) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        }
    }
}