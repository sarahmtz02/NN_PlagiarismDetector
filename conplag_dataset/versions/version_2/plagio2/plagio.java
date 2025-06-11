// plagiado_2.java
import java.util.Scanner;

public class VerificadorMayoriaEdad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int anios = entrada.nextInt();

        if (anios < 18) {
            System.out.println("No eres mayor de edad.");
        } else {
            System.out.println("Ya eres mayor de edad.");
        }
        entrada.close();
    }
}