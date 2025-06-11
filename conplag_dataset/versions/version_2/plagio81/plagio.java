// plagiado_81.java
public class InterrupcionDeCiclo { // Renombrado de clase
    public static void main(String[] args) {
        int contador = 1; // Uso de while
        while (contador <= 5) {
            if (contador == 3) {
                contador = 6; // Cambia el valor de la condición para forzar la salida
            } else {
                System.out.println("Conteo: " + contador); // Cambio de mensaje
                contador++;
            }
        }
    }
}