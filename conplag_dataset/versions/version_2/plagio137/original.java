public class BucleConCondicionDeSalida {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i >= 5) {
                break;
            }
            System.out.println("Paso " + i);
            i++;
        }
    }
}