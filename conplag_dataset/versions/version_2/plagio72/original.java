// original_72.java
import java.util.Arrays;
import java.util.List;

public class ArrayATabla {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Maria", "Pedro"};
        List<String> listaNombres = Arrays.asList(nombres);
        System.out.println("Lista: " + listaNombres);
    }
}