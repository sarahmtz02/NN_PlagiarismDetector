// original_69.java
public class PasoPorValor {
    public static void cambiarValor(int numero) {
        numero = 100; // Modifica la copia local
        System.out.println("Dentro del método: " + numero);
    }

    public static void main(String[] args) {
        int valorOriginal = 50;
        System.out.println("Antes del método: " + valorOriginal);
        cambiarValor(valorOriginal);
        System.out.println("Después del método: " + valorOriginal);
    }
}