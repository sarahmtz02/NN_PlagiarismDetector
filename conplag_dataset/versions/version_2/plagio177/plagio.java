public class MetodoConCondicionInterna {
    public static void verificarEdad(int edad) {
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }

    public static void main(String[] args) {
        verificarEdad(20);
        verificarEdad(15);
    }
}