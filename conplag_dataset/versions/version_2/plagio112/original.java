public class PasoPorReferenciaArray {
    public static void modificarArray(int[] arr) {
        arr[0] = 99;
    }

    public static void main(String[] args) {
        int[] miArray = {1, 2, 3};
        System.out.println("Antes de modificar: " + miArray[0]);
        modificarArray(miArray);
        System.out.println("Después de modificar: " + miArray[0]);
    }
}