public class BucleInfinitoConIf {
    public static void main(String[] args) {
        int contador = 0;
        while (true) {
            System.out.println("Contando: " + contador);
            contador++;
            if (contador == 4) {
                break;
            }
        }
    }
}