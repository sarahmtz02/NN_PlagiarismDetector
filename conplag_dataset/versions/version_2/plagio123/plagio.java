public class RepeticionControlada {
    public static void main(String[] args) {
        int iteraciones = 0;
        for (; ; ) {
            System.out.println("Paso número: " + iteraciones);
            if (iteraciones == 3) {
                break;
            }
            iteraciones++;
        }
    }
}