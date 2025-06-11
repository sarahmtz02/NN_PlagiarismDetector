// original_82.java
import java.util.ArrayList;
import java.util.List;

public class CopiarLista {
    public static void main(String[] args) {
        List<String> original = new ArrayList<>();
        original.add("A");
        original.add("B");
        
        List<String> copia = new ArrayList<>(original); // Constructor de copia
        copia.add("C");
        System.out.println("Original: " + original);
        System.out.println("Copia: " + copia);
    }
}