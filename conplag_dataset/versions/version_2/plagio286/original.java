import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class LeerDeStringReader {
    public static void main(String[] args) {
        String datos = "Linea 1\nLinea 2";
        try (Reader reader = new StringReader(datos)) {
            int charLeido;
            while ((charLeido = reader.read()) != -1) {
                System.out.print((char) charLeido);
            }
        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }
}