public class ConteoConNumeroGrande {
    public static void main(String[] args) {
        long iteracionesCompletadas = 0L;
        int limite = 100000;
        int i = 0;
        while (i < limite) {
            iteracionesCompletadas = iteracionesCompletadas + 1;
            i++;
        }
        System.out.println("Total de iteraciones: " + iteracionesCompletadas);
    }
}