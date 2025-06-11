// original_55.java
public class BusquedaEnArray {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int buscar = 30;
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El número " + buscar + " fue encontrado.");
        } else {
            System.out.println("El número " + buscar + " no fue encontrado.");
        }
    }
}