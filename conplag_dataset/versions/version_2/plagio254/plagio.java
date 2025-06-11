import java.util.ArrayList;
import java.util.List;

public class ClasificarColeccionDeObjetos {
    static class Item {
        String id;
        int cantidad;

        Item(String id, int cantidad) {
            this.id = id;
            this.cantidad = cantidad;
        }

        @Override
        public String toString() {
            return id + " (" + cantidad + ")";
        }
    }

    public static void main(String[] args) {
        List<Item> inventario = new ArrayList<>();
        inventario.add(new Item("A", 50));
        inventario.add(new Item("C", 20));
        inventario.add(new Item("B", 80));

        // Ordenamiento burbuja personalizado
        int n = inventario.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (inventario.get(j).cantidad > inventario.get(j + 1).cantidad) {
                    Item temp = inventario.get(j);
                    inventario.set(j, inventario.get(j + 1));
                    inventario.set(j + 1, temp);
                }
            }
        }
        System.out.println("Inventario clasificado por cantidad: " + inventario);
    }
}