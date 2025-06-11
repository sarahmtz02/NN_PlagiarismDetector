import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class LeerBytesDeCadena {
    public static void main(String[] args) {
        String textoFuente = "ABC\nDEF";
        try (InputStream is = new ByteArrayInputStream(textoFuente.getBytes(StandardCharsets.UTF_8))) {
            int byteLeido;
            while ((byteLeido = is.read()) != -1) {
                System.out.print((char) byteLeido);
            }
        } catch (IOException e) {
            System.err.println("Problema al leer bytes: " + e.getMessage());
        }
    }
}