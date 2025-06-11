public class RemoverEspaciosExtremos {
    public static void main(String[] args) {
        String textoBruto = "   Texto de ejemplo   ";
        String textoLimpio = textoBruto.replaceAll("^\\s+|\\s+$", "");
        System.out.println("Texto limpio: '" + textoLimpio + "'");
    }
}