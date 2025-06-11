import java.io.File;
import java.io.IOException;

public class EliminarArchivo {
    public static void main(String[] args) {
        File archivo = new File("archivo_a_borrar.txt");
        if (archivo.exists()) {
            if (archivo.delete()) {
                System.out.println("Archivo eliminado exitosamente.");
            } else {
                System.err.println("No se pudo eliminar el archivo.");
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }
}