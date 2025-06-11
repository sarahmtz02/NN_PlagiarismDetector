public class ImprimirContenidoArreglo {
    public static void main(String[] args) {
        int[] datos = {10, 20, 30};
        System.out.print("Contenido: [");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i]);
            if (i < datos.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}