import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterarElementosConIterator {
    public static void main(String[] args) {
        List<String> paises = Arrays.asList("España", "Francia");
        Iterator<String> it = paises.iterator();
        while (it.hasNext()) {
            System.out.println("País: " + it.next());
        }
    }
}