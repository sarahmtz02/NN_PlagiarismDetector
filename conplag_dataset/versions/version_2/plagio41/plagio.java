// plagiado_41.java
public class ConstructorDeCadenas { // Renombrado de clase
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder(); // Renombrado de objeto
        buffer.insert(0, "."); // Inserción en orden inverso y uso de insert
        buffer.insert(0, " texto");
        buffer.insert(0, " de");
        buffer.insert(0, "Cadena");
        String finalString = buffer.toString(); // Renombrado de variable
        System.out.println("Texto final: " + finalString); // Cambio de mensaje
    }
}