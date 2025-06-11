// plagiado_69.java
public class DemostracionPasoPorValor { // Renombrado de clase
    public static void alterarEntero(int parametro) { // Renombrado de método y parámetro
        parametro = 200; // Modifica la copia local
        System.out.println("En la función: " + parametro); // Cambio de mensaje
    }

    public static void main(String[] args) {
        int datoInicial = 50; // Renombrado de variable
        System.out.println("Valor inicial: " + datoInicial); // Cambio de mensaje
        alterarEntero(datoInicial);
        System.out.println("Valor final: " + datoInicial); // Cambio de mensaje
    }
}