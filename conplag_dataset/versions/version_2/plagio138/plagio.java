import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TransformarArregloAColeccion {
    public static void main(String[] args) {
        String[] dataArray = {"Item1", "Item2"};
        List<String> dataList = new ArrayList<>();
        Collections.addAll(dataList, dataArray);
        System.out.println("Colección de datos: " + dataList);
    }
}