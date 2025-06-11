// original_42.java
import java.util.Optional;

public class UsoOptional {
    public static void main(String[] args) {
        String nombre = "Juan";
        Optional<String> optionalNombre = Optional.ofNullable(nombre);

        if (optionalNombre.isPresent()) {
            System.out.println("El nombre es: " + optionalNombre.get());
        } else {
            System.out.println("El nombre no está presente.");
        }
    }
}