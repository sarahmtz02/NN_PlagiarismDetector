public class ComparacionStringLiterales {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        if (s1 == s2) {
            System.out.println("s1 y s2 apuntan al mismo objeto.");
        } else {
            System.out.println("s1 y s2 no apuntan al mismo objeto.");
        }
    }
}