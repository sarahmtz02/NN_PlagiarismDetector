import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class EscribirAByteArrayOutputStream {
    public static void main(String[] args) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            String datos = "Hola";
            bos.write(datos.getBytes());
            System.out.println("Bytes escritos: " + bos.toString());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}