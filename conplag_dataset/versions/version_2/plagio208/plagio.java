public class BucleConCondicionDeParada {
    public static void main(String[] args) {
        int iterador = 0;
        do {
            System.out.println("Iteración: " + iterador);
            iterador++;
            if (iterador == 4) {
                return; // Usar return en lugar de break para salir del main
            }
        } while (true);
    }
}