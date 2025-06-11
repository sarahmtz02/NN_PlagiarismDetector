// plagiado_56.java
public class OperacionesConCadenas { // Renombrado de clase
    public static void main(String[] args) {
        String cadenaFuente = "Java Programming"; // Renombrado de variable
        String parteInicial = "";
        for (int i = 0; i < 4; i++) { // Reimplementación manual de substring
            parteInicial += cadenaFuente.charAt(i);
        }

        String cadenaModificada = cadenaFuente.split(" ")[0] + " Development"; // Reimplementación manual de replace
        
        System.out.println("Segmento: " + parteInicial); // Cambio de mensaje
        System.out.println("Texto modificado: " + cadenaModificada); // Cambio de mensaje
    }
}