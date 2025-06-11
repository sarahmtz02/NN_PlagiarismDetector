public class BuscarSubcadena {
    public static void main(String[] args) {
        String textoPrincipal = "Aprendiendo programacion en Java";
        String patron = "programacion";
        if (textoPrincipal.indexOf(patron) != -1) {
            System.out.println("El texto principal incluye el patrón.");
        } else {
            System.out.println("El texto principal no incluye el patrón.");
        }
    }
}