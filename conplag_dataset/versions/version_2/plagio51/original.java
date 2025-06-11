// original_51.java
import java.util.LinkedList;
import java.util.Queue;

public class ColaSimple {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        cola.offer("Primero");
        cola.offer("Segundo");
        cola.offer("Tercero");

        System.out.println("Elementos en la cola: " + cola);
        System.out.println("Siguiente en la cola: " + cola.peek());
        System.out.println("Elemento removido: " + cola.poll());
        System.out.println("Cola después de remover: " + cola);
    }
}