public class ClaseConBloqueEstatico {
    static {
        System.out.println("Bloque estático ejecutado al cargar la clase.");
    }

    public static void main(String[] args) {
        System.out.println("Método main ejecutado.");
    }
}