public class ManejoDeExcepcionesGenerico {
    public static void main(String[] args) {
        try {
            int[] nums = new int[5];
            nums[10] = 100;
        } catch (Exception e) {
            System.err.println("Se ha producido un error general: " + e.getMessage());
        }
    }
}