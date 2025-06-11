public class ReemplazarSubcadena {
    public static void main(String[] args) {
        String cadenaOriginal = "El sol brilla";
        String cadenaAlterada = cadenaOriginal.replaceAll("brilla", "calienta");
        System.out.println("Cadena resultante: " + cadenaAlterada);
    }
}