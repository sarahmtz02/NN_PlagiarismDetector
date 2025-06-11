// original_62.java
public class ManejoDeNulos {
    public static void main(String[] args) {
        String texto = null;
        if (texto != null) {
            System.out.println("Longitud: " + texto.length());
        } else {
            System.out.println("La cadena es nula.");
        }
    }
}