// plagiado_31.java
import java.io.BufferedWriter; // Uso de BufferedWriter
import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeTexto { // Renombrado de clase
    public static void main(String[] args) {
        String data = "Aquí va algo de información."; // Renombrado de variable y cambio de contenido
        String nombreArchivo = "mi_documento.txt"; // Renombrado de archivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) { // Uso de try-with-resources y BufferedWriter
            bw.write(data);
            System.out.println("Se guardó el archivo '" + nombreArchivo + "'.");
        } catch (IOException ex) {
            System.err.println("Problema al generar el documento: " + ex.getLocalizedMessage()); // Mensaje de error modificado
        }
    }
}