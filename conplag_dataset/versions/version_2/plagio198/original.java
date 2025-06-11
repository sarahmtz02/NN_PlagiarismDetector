public class OperadorLogicoOR {
    public static void main(String[] args) {
        boolean condicion1 = false;
        boolean condicion2 = true;
        if (condicion1 || condicion2) {
            System.out.println("Al menos una condición es verdadera.");
        } else {
            System.out.println("Ninguna condición es verdadera.");
        }
    }
}