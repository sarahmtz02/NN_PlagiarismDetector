// plagiado_6.java
public class EncontrarMaximo {
    public static void main(String[] args) {
        int a = 15;
        int b = 7;
        int c = 20;
        int maximo;

        if (b > a && b > c) { // Orden de comparación cambiado
            maximo = b;
        } else if (a > c && a > b) {
            maximo = a;
        } else {
            maximo = c;
        }
        System.out.println("El valor más grande es: " + maximo);
    }
}