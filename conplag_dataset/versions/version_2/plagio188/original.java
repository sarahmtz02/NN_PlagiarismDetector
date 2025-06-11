public class IfElseIfEncadenado {
    public static void main(String[] args) {
        int puntuacion = 85;
        if (puntuacion >= 90) {
            System.out.println("Grado A");
        } else if (puntuacion >= 80) {
            System.out.println("Grado B");
        } else {
            System.out.println("Grado C o inferior");
        }
    }
}