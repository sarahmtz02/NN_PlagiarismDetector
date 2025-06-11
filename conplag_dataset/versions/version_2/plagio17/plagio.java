// plagiado_17.java
public class ClasificadorEdad {
    public static void main(String[] args) {
        int anios = 20;
        String clasificacion;
        if (anios >= 18) { // Reemplazo de operador ternario por if-else
            clasificacion = "Mayor de edad";
        } else {
            clasificacion = "Menor de edad";
        }
        System.out.println("La clasificación es: " + clasificacion);
    }
}