public class ObjetoNulo {
    public static void main(String[] args) {
        String miObjeto = null;
        try {
            System.out.println("Longitud: " + miObjeto.length());
        } catch (NullPointerException e) {
            System.err.println("Se intentó operar sobre un objeto nulo.");
        }
    }
}