public class CastingADentero {
    public static void main(String[] args) {
        double numeroDecimal = 15.7;
        int numeroEntero = Double.valueOf(numeroDecimal).intValue();
        System.out.println("Decimal a entero: " + numeroEntero);
    }
}