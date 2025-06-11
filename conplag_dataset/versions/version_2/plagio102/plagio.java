import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SumadorEntradaUsuario {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Dame el primer valor: ");
        String s1 = reader.readLine();
        int val1 = Integer.parseInt(s1);
        System.out.print("Dame el segundo valor: ");
        String s2 = reader.readLine();
        int val2 = Integer.parseInt(s2);
        int total = val1 + val2;
        System.out.println("El resultado de la adición es: " + total);
    }
}