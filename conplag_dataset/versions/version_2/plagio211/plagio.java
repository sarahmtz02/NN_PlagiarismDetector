public class SustraccionDeNumeros {
    public static void main(String[] args) {
        int minuendo = 15;
        int sustraendo = 7;
        int resultado = minuendo + (~sustraendo + 1); // Suma del minuendo con el complemento a dos del sustraendo
        System.out.println("El resultado de la resta es: " + resultado);
    }
}