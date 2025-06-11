import java.util.Scanner;

public class EntradaStringSimple {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Hola, " + nombre + "!");
        entrada.close();
    }
}