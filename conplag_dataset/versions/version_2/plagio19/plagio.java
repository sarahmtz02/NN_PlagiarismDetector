// plagiado_19.java
public class DuplicarNumero {
    public static double obtenerDoble(double entrada) { // Renombrado de método y parámetro
        double resultado = 0;
        resultado = entrada + entrada; // Cambio de operación
        return resultado;
    }

    public static void main(String[] args) {
        double miNumero = 7.5;
        double elDoble = obtenerDoble(miNumero);
        System.out.println("Duplicado de " + miNumero + " es: " + elDoble);
    }
}