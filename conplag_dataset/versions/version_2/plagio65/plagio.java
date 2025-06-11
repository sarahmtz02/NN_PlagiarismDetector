// plagiado_65.java
public class PatronDeSimbolos { // Renombrado de clase
    public static void main(String[] args) {
        int altura = 3; // Renombrado de variable
        for (int r = 1; r <= altura; r++) { // Bucle exterior con inicio en 1
            int c = 1;
            while (c <= r) { // Bucle interior con while
                System.out.print("#"); // Cambio de símbolo
                c++;
            }
            System.out.print("\n"); // Uso de '\n' en lugar de println
        }
    }
}