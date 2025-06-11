import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class GuardarContenidoEnFichero {
    public static void main(String[] args) {
        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("destino.txt"), StandardCharsets.UTF_8)) {
            osw.write("Contenido de la línea uno.\n");
            osw.write("Contenido de la línea dos.");
            osw.flush();
        } catch (IOException ex) {
            System.err.println("Problema al guardar el fichero: " + ex.getMessage());
        }
    }
}