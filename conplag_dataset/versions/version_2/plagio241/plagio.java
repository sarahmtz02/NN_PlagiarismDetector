public class CastearEnteroADecimal {
    public static void main(String[] args) {
        int valorInt = 25;
        double valorDouble = Integer.valueOf(valorInt).doubleValue();
        System.out.println("Casting de int a double: " + valorDouble);
    }
}