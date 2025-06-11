// plagiado_14.java
public class MenuOpciones {
    public static void main(String[] args) {
        int eleccion = 2;
        if (eleccion == 1) { // Reemplazo de switch por if-else if
            System.out.println("Elegiste el número 1");
        } else if (eleccion == 2) {
            System.out.println("Elegiste el número 2");
        } else if (eleccion == 3) {
            System.out.println("Elegiste el número 3");
        } else {
            System.out.println("Selección inválida.");
        }
    }
}