// original_52.java
public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicion1 = true;
        boolean condicion2 = false;

        System.out.println("AND: " + (condicion1 && condicion2));
        System.out.println("OR: " + (condicion1 || condicion2));
        System.out.println("NOT de condicion1: " + (!condicion1));
    }
}