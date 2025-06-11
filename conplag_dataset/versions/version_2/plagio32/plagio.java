// plagiado_32.java
import java.util.LinkedList; // Cambio de tipo de lista
import java.util.List;
import java.util.stream.Collectors; // Uso de Streams API

public class ExtraerPares { // Renombrado de clase
    public static void main(String[] args) {
        List<Integer> secuencia = new LinkedList<>(); // Uso de LinkedList
        for (int j = 1; j <= 10; j++) {
            secuencia.add(j);
        }

        // Uso de Streams API para filtrar
        List<Integer> numPares = secuencia.stream()
                                        .filter(n -> n % 2 == 0)
                                        .collect(Collectors.toList());

        System.out.println("Solo los números pares: " + numPares); // Cambio de mensaje
    }
}