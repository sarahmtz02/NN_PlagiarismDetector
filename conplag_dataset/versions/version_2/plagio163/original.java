public class ConcatenacionConFormat {
    public static void main(String[] args) {
        String nombre = "Pedro";
        int edad = 25;
        String info = String.format("Nombre: %s, Edad: %d", nombre, edad);
        System.out.println(info);
    }
}