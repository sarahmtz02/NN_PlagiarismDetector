public class FuncionConArrayDeArgumentos {
    public static void mostrarElementos(int[] elementos) {
        for (int elem : elementos) {
            System.out.println("Elemento: " + elem);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        mostrarElementos(arr1);
        int[] arr2 = {10, 20};
        mostrarElementos(arr2);
    }
}