public class ComprobarPrefijoCadena {
    public static void main(String[] args) {
        String palabra = "desarrollo";
        if (palabra.indexOf("des") == 0) {
            System.out.println("La palabra inicia con el prefijo 'des'.");
        } else {
            System.out.println("La palabra no inicia con el prefijo 'des'.");
        }
    }
}