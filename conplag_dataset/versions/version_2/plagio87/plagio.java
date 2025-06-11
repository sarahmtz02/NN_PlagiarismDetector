public class EvaluacionDeNotas {
    public static void main(String[] args) {
        int nota = 85;
        String nivel;
        if (nota >= 90) {
            nivel = "A+";
        } else if (nota >= 70) {
            nivel = "C";
        } else {
            nivel = "F";
        }
        System.out.println("Nivel obtenido: " + nivel);
    }
}