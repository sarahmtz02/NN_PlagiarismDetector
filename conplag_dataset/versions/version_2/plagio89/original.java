public class BucleInfinitoConSalida {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            System.out.println("Iteración: " + count);
            count++;
            if (count >= 5) {
                break;
            }
        }
    }
}