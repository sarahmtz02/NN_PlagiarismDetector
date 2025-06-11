import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivoCaracterPorCaracter {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("ejemplo.txt")) {
            int caracter;
            while ((caracter = reader.read()) != -1) {
                System.out.print((char) caracter);
            }
        } catch (IOException e) {
            System.err.println("Error de lectura: " + e.getMessage());
        }
    }
}