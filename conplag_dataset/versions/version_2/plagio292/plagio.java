public class ReemplazarCaracterEnCadena {
    public static void main(String[] args) {
        String palabra = "elefante";
        StringBuilder sb = new StringBuilder(palabra);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'e') {
                sb.setCharAt(i, 'x');
            }
        }
        System.out.println("Palabra alterada: " + sb.toString());
    }
}