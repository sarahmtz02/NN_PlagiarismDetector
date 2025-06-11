public class OperacionBitwiseYAsignacion {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;
        int z = x & y;
        x = z;
        System.out.println("Valor final de x: " + x);
    }
}