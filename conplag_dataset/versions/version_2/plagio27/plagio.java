// plagiado_27.java
public class ClasificarArreglo { // Renombrado de clase
    public static void main(String[] args) {
        int[] valores = {5, 2, 8, 1, 9}; // Renombrado de array

        // Algoritmo de burbuja (Bubble Sort) en lugar de Arrays.sort
        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = 0; j < valores.length - 1 - i; j++) {
                if (valores[j] > valores[j + 1]) {
                    int temp = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = temp;
                }
            }
        }

        System.out.print("Arreglo clasificado: ["); // Cambio de mensaje de salida y formato
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + (i == valores.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}