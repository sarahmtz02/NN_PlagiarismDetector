import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarListaObjetos {
    static class Producto {
        String nombre;
        double precio;

        Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        @Override
        public String toString() {
            return nombre + " ($" + precio + ")";
        }
    }

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Manzana", 1.5));
        productos.add(new Producto("Naranja", 1.0));
        productos.add(new Producto("Plátano", 0.75));

        Collections.sort(productos, Comparator.comparing(p -> p.precio));
        System.out.println("Productos ordenados por precio: " + productos);
    }
}