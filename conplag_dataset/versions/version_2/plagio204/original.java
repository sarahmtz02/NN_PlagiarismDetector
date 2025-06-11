public class MetodoConCondicionalDoble {
    public static void clasificarNumero(int num) {
        if (num > 0) {
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }

    public static void main(String[] args) {
        clasificarNumero(5);
        clasificarNumero(-3);
        clasificarNumero(0);
    }
}