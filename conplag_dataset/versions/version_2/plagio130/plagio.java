public class EvaluacionLogica {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        boolean condicion1 = (a > 5);
        boolean condicion2 = (b < 10);
        if (condicion1) {
            if (condicion2) {
                System.out.println("Las dos expresiones son ciertas.");
            } else {
                System.out.println("La segunda expresión no es cierta.");
            }
        } else {
            System.out.println("La primera expresión no es cierta.");
        }
    }
}