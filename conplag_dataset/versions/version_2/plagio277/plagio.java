public class LeerVariableDeClase {
    private static String datoDeClase = "Dato global";

    public static String obtenerDato() {
        return datoDeClase;
    }

    public static void main(String[] args) {
        System.out.println("Variable de clase: " + obtenerDato());
    }
}