// plagiado_52.java
public class LogicaBooleana { // Renombrado de clase
    public static void main(String[] args) {
        boolean estadoA = true; // Renombrado de variable
        boolean estadoB = false; // Renombrado de variable

        String resultadoAnd;
        if (estadoA && estadoB) { // Uso de if para AND
            resultadoAnd = "Verdadero";
        } else {
            resultadoAnd = "Falso";
        }
        System.out.println("Resultado de la conjunción: " + resultadoAnd); // Cambio de mensaje y método

        String resultadoOr = (estadoA || estadoB) ? "Verdadero" : "Falso"; // Uso de operador ternario para OR
        System.out.println("Resultado de la disyunción: " + resultadoOr); // Cambio de mensaje

        boolean negacionEstadoA = !estadoA; // Uso de variable temporal para NOT
        System.out.println("Negación de estadoA: " + negacionEstadoA); // Cambio de mensaje
    }
}