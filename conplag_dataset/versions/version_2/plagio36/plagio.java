// plagiado_36.java
public class ChecarSignoNumerico { // Renombrado de clase
    public static void main(String[] args) {
        int valor = -5; // Renombrado de variable
        String clasificacion;

        if (valor == 0) { // Reordenamiento de las condiciones
            clasificacion = "Es el número cero";
        } else if (valor < 0) {
            clasificacion = "Es un número negativo";
        } else {
            clasificacion = "Es un número positivo";
        }
        System.out.println(clasificacion + "."); // Mensaje conciso
    }
}