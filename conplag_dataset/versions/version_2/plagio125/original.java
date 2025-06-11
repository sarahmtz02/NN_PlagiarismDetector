import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EncontrarMaximoLista {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(5);
        nums.add(20);
        int maximo = Collections.max(nums);
        System.out.println("Máximo elemento: " + maximo);
    }
}