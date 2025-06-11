// plagiado_29.java
public class UnirTextos { // Renombrado de clase
    public static void main(String[] args) {
        String primerTexto = "Hola"; // Renombrado de variable
        String segundoTexto = "Mundo"; // Renombrado de variable
        
        StringBuilder constructor = new StringBuilder(); // Uso de StringBuilder para concatenación
        constructor.append(primerTexto);
        constructor.append(" ");
        constructor.append(segundoTexto);
        
        System.out.println("Resultado de unión: " + constructor.toString()); // Cambio de mensaje
    }
}