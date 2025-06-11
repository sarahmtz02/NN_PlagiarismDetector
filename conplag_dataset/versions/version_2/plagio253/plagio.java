public class IteracionAseguradaUnaVez {
    public static void main(String[] args) {
        int i = 0;
        // Simulación de do-while usando un for y una bandera o condición inicial
        boolean primeraEjecucion = true;
        for (; primeraEjecucion || i < 3; i++, primeraEjecucion = false) {
            System.out.println("Paso: " + i);
            if (i >= 2) break; // Termina después de 0, 1, 2
        }
    }
}