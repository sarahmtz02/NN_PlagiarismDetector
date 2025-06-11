public class OrdenarArregloManualmente {
    public static void main(String[] args) {
        int[] datos = {3, 1, 2};
        
        // Ordenamiento burbuja
        int n = datos.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (datos[j] > datos[j + 1]) {
                    int temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                }
            }
        }
        System.out.print("Arreglo clasificado: [");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i]);
            if (i < datos.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}