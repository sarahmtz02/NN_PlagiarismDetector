import java.util.Stack;

public class UsoDeStack {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
        pila.push("Primero");
        pila.push("Segundo");
        System.out.println("Cima de la pila: " + pila.peek());
        System.out.println("Sacando: " + pila.pop());
        System.out.println("Pila restante: " + pila);
    }
}