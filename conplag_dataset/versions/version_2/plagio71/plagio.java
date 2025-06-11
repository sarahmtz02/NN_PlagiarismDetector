// plagiado_71.java
public class ObtenerProductoNumeros { // Renombrado de clase
    public static int productoConsecutivo(int valor) { // Renombrado de método y parámetro
        int resultado = 1; // Renombrado de variable
        int contador = 1;
        while (contador <= valor) { // Bucle while en lugar de for
            resultado = resultado * contador; // Multiplicación explícita
            contador++;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int n = 5; // Renombrado de variable
        System.out.println("El producto de los enteros hasta " + n + " es: " + productoConsecutivo(n)); // Cambio de mensaje
    }
}