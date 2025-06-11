public class CalcularValorNoNegativo {
    public static void main(String[] args) {
        int entrada = -10;
        int resultado = (entrada < 0) ? -entrada : entrada;
        System.out.println("Resultado sin signo: " + resultado);
    }
}