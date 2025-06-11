public class ComparacionStringEqualsIgnoreCase {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "java";
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Las cadenas son iguales ignorando mayúsculas/minúsculas.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
    }
}