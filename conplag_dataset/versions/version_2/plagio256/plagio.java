import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class GuardarContenidoEnUnFichero {
    public static void main(String[] args) {
        String textoAGuardar = "Contenido básico para almacenar.";
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
             new FileOutputStream("fichero_salida.txt"), StandardCharsets.UTF_8))) {
            bw.write(textoAGuardar);
            System.out.println("Fichero 'fichero_salida.txt' ha sido grabado.");
        } catch (IOException ex) {
            System.err.println("Error al grabar el fichero: " + ex.getMessage());
        }
    }
}