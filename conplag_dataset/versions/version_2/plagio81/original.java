// original_81.java
public class BucleConBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Sale del bucle cuando i es 3
            }
            System.out.println("Número: " + i);
        }
    }
}