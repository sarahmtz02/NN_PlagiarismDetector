// original_37.java
import java.util.Scanner;

public class EntradaTextoBasico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Hola, " + nombre + "!");
        entrada.close();
    }
}