// plagiado_15.java
public class ArregloEnteros {
    public static void main(String[] args) {
        int[] datos = new int[5]; // Declaración y asignación por separado
        datos[0] = 1;
        datos[1] = 2;
        datos[2] = 3;
        datos[3] = 4;
        datos[4] = 5;

        int k = 0;
        while (k < datos.length) { // Bucle while en lugar de for
            System.out.println("Dato en posición " + k + ": " + datos[k]);
            k++;
        }
    }
}