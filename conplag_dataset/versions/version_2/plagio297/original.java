public class ManejoDeExcepcionesMultiples {
    public static void main(String[] args) {
        try {
            int[] nums = new int[5];
            nums[10] = 100; // ArrayIndexOutOfBoundsException
            int res = 10 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error de índice: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Error aritmético: " + e.getMessage());
        }
    }
}