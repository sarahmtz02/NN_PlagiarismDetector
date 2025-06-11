public class IfElseAnidado {
    public static void main(String[] args) {
        int calificacion = 85;
        if (calificacion >= 90) {
            System.out.println("Excelente");
        } else {
            if (calificacion >= 70) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
        }
    }
}