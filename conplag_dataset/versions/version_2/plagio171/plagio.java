public class AsignacionCondicional {
    public static void main(String[] args) {
        int puntaje = 75;
        String resultado;
        if (puntaje >= 70) {
            resultado = "Aprobado";
        } else {
            resultado = "Reprobado";
        }
        System.out.println("Condición académica: " + resultado);
    }
}