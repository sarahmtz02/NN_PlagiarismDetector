public class UsoInstanceOf {
    public static void main(String[] args) {
        Object obj = "Soy una cadena";
        if (obj instanceof String) {
            System.out.println("El objeto es una instancia de String.");
        } else {
            System.out.println("El objeto no es una instancia de String.");
        }
    }
}