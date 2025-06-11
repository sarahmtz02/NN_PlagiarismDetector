public class CalculoPromedio {
    public static void main(String[] args) {
        int[] notas = {80, 90, 75, 95};
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        double promedio = (double) suma / notas.length;
        System.out.println("El promedio es: " + promedio);
    }
}