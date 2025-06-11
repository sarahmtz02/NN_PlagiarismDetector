// plagiado_21.java
public class SecuenciaFib {
    public static int obtenerValorFibonacci(int index) { // Renombrado de método y parámetro
        if (index == 0) return 0; // Condición base desglosada
        if (index == 1) return 1;
        return obtenerValorFibonacci(index - 1) + obtenerValorFibonacci(index - 2);
    }

    public static void main(String[] args) {
        int posicion = 6;
        System.out.println("El número Fibonacci en la posición " + posicion + " es: " + obtenerValorFibonacci(posicion));
    }
}