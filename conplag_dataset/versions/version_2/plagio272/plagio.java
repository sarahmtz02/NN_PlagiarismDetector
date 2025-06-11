public class ReemplazarEspaciosPorCaracter {
    public static void main(String[] args) {
        String frase = "Palabra  otra  más";
        StringBuilder sb = new StringBuilder();
        boolean espacioPrevio = false;
        for (char c : frase.toCharArray()) {
            if (Character.isWhitespace(c)) {
                if (!espacioPrevio) { // Solo añadir un guion si el anterior no era espacio
                    sb.append("-");
                }
                espacioPrevio = true;
            } else {
                sb.append(c);
                espacioPrevio = false;
            }
        }
        System.out.println("Frase unida: " + sb.toString());
    }
}