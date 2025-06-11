public class DecisionSimple {
    public static void main(String[] args) {
        int anios = 20;
        String clasificacion;
        if (anios >= 18) {
            clasificacion = "Mayor de edad";
        } else {
            clasificacion = "Menor de edad";
        }
        System.out.println("Categoría: " + clasificacion);
    }
}