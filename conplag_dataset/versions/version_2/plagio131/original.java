public class ConversionDeCharAInt {
    public static void main(String[] args) {
        char caracter = '5';
        int numero = Character.getNumericValue(caracter);
        System.out.println("Carácter a número: " + numero);
    }
}