// plagiado_76.java
public class ProcesadorDeParametros { // Renombrado de clase
    public static void main(String[] parametros) { // Renombrado del arreglo de argumentos
        if (parametros.length == 0) { // Condición invertida
            System.out.println("Sin parámetros de entrada."); // Cambio de mensaje
        } else {
            System.out.println("El primer parámetro es: " + parametros[0]); // Cambio de mensaje
        }
    }
}