public class ComparacionStringEquals {
    public static void main(String[] args) {
        String s1 = "manzana";
        String s2 = "manzana";
        if (s1.equals(s2)) {
            System.out.println("Las cadenas son iguales en contenido.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
    }
}