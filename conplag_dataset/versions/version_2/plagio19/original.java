// original_19.java
public class MetodoConRetorno {
    public static double calcularDoble(double valor) {
        return valor * 2;
    }

    public static void main(String[] args) {
        double num = 7.5;
        double doble = calcularDoble(num);
        System.out.println("El doble de " + num + " es: " + doble);
    }
}