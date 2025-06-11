public class RemoverBlancos {
    public static void main(String[] args) {
        String fraseConBlancos = "   delante y detras   ";
        String fraseSinBlancos = fraseConBlancos.replaceAll("^\\s+|\\s+$", "");
        System.out.println("Cadena depurada: '" + fraseSinBlancos + "'");
    }
}