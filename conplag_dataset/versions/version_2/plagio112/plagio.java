public class AlterarContenidoArreglo {
    public static void cambiarPrimerElemento(int[] coleccion) {
        coleccion[0] = 99;
    }

    public static void main(String[] args) {
        int[] datos = {1, 2, 3};
        System.out.println("Estado inicial: " + datos[0]);
        cambiarPrimerElemento(datos);
        System.out.println("Estado final: " + datos[0]);
    }
}