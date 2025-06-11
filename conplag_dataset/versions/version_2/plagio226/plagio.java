import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProcesarArchivoLineaPorLinea {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Falló la lectura del fichero: " + e.getMessage());
        }
    }
}