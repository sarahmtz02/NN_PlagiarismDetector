import java.util.LinkedList;
import java.util.Queue;

public class UsoDeQueue {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        cola.offer("Tarea1");
        cola.offer("Tarea2");
        System.out.println("Elemento al frente: " + cola.peek());
        System.out.println("Desencolando: " + cola.poll());
        System.out.println("Cola restante: " + cola);
    }
}