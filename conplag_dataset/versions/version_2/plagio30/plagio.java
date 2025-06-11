// plagiado_30.java
public class TotalizarElementos { // Renombrado de clase
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5}; // Renombrado de array
        int total = 0; // Renombrado de variable
        int indice = 0;
        while (indice < valores.length) { // Bucle while en lugar de for
            total = total + valores[indice]; // Suma explícita
            indice++;
        }
        System.out.println("El total de los valores es: " + total); // Cambio de mensaje
    }
}