public class DetectorDePrimos {
    public static void main(String[] args) {
        int valor = 7;
        boolean resultado = true;
        if (valor == 0 || valor == 1) {
            resultado = false;
        } else {
            for (int k = 2; k * k <= valor; k++) {
                if (valor % k == 0) {
                    resultado = false;
                    break;
                }
            }
        }
        System.out.println("El número " + valor + " es un número primo: " + resultado);
    }
}