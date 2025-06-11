// original_76.java
public class ManejoDeArgumentosMain {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Primer argumento: " + args[0]);
        } else {
            System.out.println("No se proveyeron argumentos.");
        }
    }
}