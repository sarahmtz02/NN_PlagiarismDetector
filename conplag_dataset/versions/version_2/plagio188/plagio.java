public class EvaluacionDeCalificacion {
    public static void main(String[] args) {
        int nota = 85;
        String resultado;
        switch (nota / 10) { // Usamos división para agrupar rangos
            case 10:
            case 9:
                resultado = "Excelente";
                break;
            case 8:
                resultado = "Bueno";
                break;
            default:
                resultado = "Suficiente o deficiente";
                break;
        }
        System.out.println("Clasificación: " + resultado);
    }
}