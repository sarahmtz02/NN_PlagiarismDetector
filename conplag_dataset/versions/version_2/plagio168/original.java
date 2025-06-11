public class ManejoDeExcepcionesConMultiplesCatch {
    public static void main(String[] args) {
        try {
            String[] arr = new String[2];
            String s = arr[3]; // ArrayIndexOutOfBoundsException
            int num = Integer.parseInt("abc"); // NumberFormatException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error de índice de array.");
        } catch (NumberFormatException e) {
            System.err.println("Error de formato de número.");
        }
    }
}