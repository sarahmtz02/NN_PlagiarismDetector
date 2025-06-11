import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProcesarContenidoDeFichero {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("otro_fichero.txt"))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            System.err.println("Problema de E/S al procesar el fichero: " + e.getMessage());
        }
    }
}