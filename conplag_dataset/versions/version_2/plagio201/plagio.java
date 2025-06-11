public class OperacionMultiplicacion {
    public static void main(String[] args) {
        int factor1 = 5;
        int factor2 = 4;
        int resultado = 0;
        for (int i = 0; i < factor2; i++) {
            resultado += factor1;
        }
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}