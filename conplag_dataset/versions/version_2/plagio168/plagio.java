public class GestionDeErroresMultiples {
    public static void main(String[] args) {
        try {
            int[] data = new int[5];
            int valor = data[5]; // Aquí podría ocurrir
            String texto = "XYZ";
            int parseo = Integer.parseInt(texto); // Aquí podría ocurrir
        } catch (RuntimeException e) {
            if (e instanceof ArrayIndexOutOfBoundsException) {
                System.err.println("Problema con el acceso al arreglo.");
            } else if (e instanceof NumberFormatException) {
                System.err.println("Problema con la conversión de formato.");
            } else {
                System.err.println("Un error inesperado ocurrió.");
            }
        }
    }
}