public class BucleConCondicionNegada {
    public static void main(String[] args) {
        int contador = 0;
        while (!(contador >= 3)) {
            System.out.println("Iteración: " + contador);
            contador++;
        }
    }
}