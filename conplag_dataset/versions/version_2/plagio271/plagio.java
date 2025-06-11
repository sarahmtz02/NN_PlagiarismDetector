public class DivisionYAsignacion {
    public static void main(String[] args) {
        int numero = 20;
        int divisor = 4;
        int cociente = 0;
        while (numero >= divisor) {
            numero -= divisor;
            cociente++;
        }
        numero = cociente; // Asignamos el resultado al número original
        System.out.println("Valor final del número: " + numero);
    }
}