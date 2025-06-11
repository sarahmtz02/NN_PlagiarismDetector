// original_6.java
public class MayorDeTresNumeros {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 7;
        int num3 = 20;
        int mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }
        System.out.println("El número mayor es: " + mayor);
    }
}