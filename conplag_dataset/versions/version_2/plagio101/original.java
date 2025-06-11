public class NumeroPrimo {
    public static void main(String[] args) {
        int num = 7;
        boolean esPrimo = true;
        if (num <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        System.out.println(num + " es primo: " + esPrimo);
    }
}