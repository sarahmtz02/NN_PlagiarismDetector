public class MetodoConParametroYRetorno {
    public static String crearSaludo(String nombre) {
        return "Hola, " + nombre + "!";
    }

    public static void main(String[] args) {
        String saludo = crearSaludo("Juan");
        System.out.println(saludo);
    }
}