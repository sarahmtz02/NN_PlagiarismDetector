// original_44.java
public class SobrecargaMetodos {
    public int operar(int a, int b) {
        return a + b;
    }

    public double operar(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        SobrecargaMetodos obj = new SobrecargaMetodos();
        System.out.println("Suma: " + obj.operar(10, 5));
        System.out.println("Producto: " + obj.operar(10.0, 5.0));
    }
}