public class ResiduoDeDivision {
    public static void main(String[] args) {
        int dividendo = 15;
        int divisor = 4;
        int resultadoEntero = dividendo / divisor;
        int remanente = dividendo - (resultadoEntero * divisor);
        System.out.println("El remanente es: " + remanente);
    }
}