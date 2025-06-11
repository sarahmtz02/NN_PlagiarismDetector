public class StringFormatSimple {
    public static void main(String[] args) {
        String nombre = "Ana";
        int edad = 25;
        String mensaje = String.format("La persona %s tiene %d años.", nombre, edad);
        System.out.println(mensaje);
    }
}