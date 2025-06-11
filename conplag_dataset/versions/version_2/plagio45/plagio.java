// plagiado_45.java
import java.util.Arrays; // Uso de Arrays para conversión
import java.util.List;

public class BuscarValorMaximo { // Renombrado de clase
    public static void main(String[] args) {
        List<Integer> coleccion = Arrays.asList(10, 5, 20, 15); // Creación de lista diferente

        int valorMayor = Integer.MIN_VALUE; // Inicialización con valor mínimo
        for (int i = 0; i < coleccion.size(); i++) { // Bucle for tradicional
            if (coleccion.get(i) > valorMayor) {
                valorMayor = coleccion.get(i);
            }
        }
        System.out.println("El valor más alto de la colección es: " + valorMayor); // Cambio de mensaje
    }
}