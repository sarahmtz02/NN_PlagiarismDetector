public class LoopControladoPorBandera {
    public static void main(String[] args) {
        boolean continuar = true;
        int iterador = 0;
        for (; continuar ;) {
            System.out.println("Procesando... " + iterador);
            iterador++;
            if (iterador >= 4) {
                continuar = false;
            }
        }
    }
}