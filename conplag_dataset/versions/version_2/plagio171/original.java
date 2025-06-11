public class OperadorTernarioParaAsignacion {
    public static void main(String[] args) {
        int calificacion = 75;
        String estado = (calificacion >= 70) ? "Aprobado" : "Reprobado";
        System.out.println("Estado del estudiante: " + estado);
    }
}