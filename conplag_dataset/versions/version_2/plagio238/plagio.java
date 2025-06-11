public class BuscarSubcadenaIgnorandoCaso {
    public static void main(String[] args) {
        String frase = "Programacion EN Java";
        String patron = "java";
        if (frase.toLowerCase().indexOf(patron.toLowerCase()) != -1) {
            System.out.println("La frase incluye el patrón sin considerar el caso.");
        } else {
            System.out.println("La frase no incluye el patrón.");
        }
    }
}