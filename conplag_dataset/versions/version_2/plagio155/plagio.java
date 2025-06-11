public class RedondearHaciaArriba {
    public static void main(String[] args) {
        double numero = 4.3;
        double resultado = (double) ((int) numero);
        if (resultado < numero) {
            resultado += 1.0;
        }
        System.out.println("Redondeado hacia arriba: " + resultado);
    }
}