// plagiado_49.java
public class UtilidadTexto { // Renombrado de clase
    public static String generarTextoFijo() { // Renombrado de método
        String texto = "Un texto fijo generado."; // Cambio de contenido
        return texto;
    }

    public static void main(String[] args) {
        System.out.println(UtilidadTexto.generarTextoFijo()); // Invocación explícita con nombre de clase
    }
}