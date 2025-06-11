public class CompararStrings {
    public static void main(String[] args) {
        String s1 = "hola";
        String s2 = "Hola";
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Las cadenas son iguales (ignorando mayúsculas/minúsculas).");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
    }
}