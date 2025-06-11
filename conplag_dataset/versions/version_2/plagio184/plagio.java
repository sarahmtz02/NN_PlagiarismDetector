public class ComprobarTextoVacio {
    public static void main(String[] args) {
        String miCadena = "";
        if (miCadena.length() == 0) {
            System.out.println("La cadena no contiene caracteres.");
        } else {
            System.out.println("La cadena sí contiene caracteres.");
        }
    }
}