// plagiado_28.java
public class ConvertidorAMayus { // Renombrado de clase
    public static void main(String[] args) {
        String cadenaOriginal = "programacion"; // Renombrado de variable
        StringBuilder resultado = new StringBuilder(); // Uso de StringBuilder

        for (char c : cadenaOriginal.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                resultado.append((char) (c - 32)); // Conversión manual a mayúsculas
            } else {
                resultado.append(c);
            }
        }
        System.out.println("Convertido a mayúsculas: " + resultado.toString()); // Cambio de mensaje
    }
}