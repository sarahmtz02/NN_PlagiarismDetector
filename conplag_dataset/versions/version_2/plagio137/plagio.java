public class IteracionLimitada {
    public static void main(String[] args) {
        int cuenta = 0;
        boolean continuarBucle = true;
        while (continuarBucle) {
            System.out.println("Conteo " + cuenta);
            cuenta++;
            if (cuenta == 5) {
                continuarBucle = false;
            }
        }
    }
}