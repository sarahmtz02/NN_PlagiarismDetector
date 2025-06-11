public class ManejoDePunteroNulo {
    public static void main(String[] args) {
        String referenciaNula = null;
        if (referenciaNula == null) {
            System.err.println("La referencia es nula, no se puede usar.");
        } else {
            System.out.println("Longitud de la referencia: " + referenciaNula.length());
        }
    }
}