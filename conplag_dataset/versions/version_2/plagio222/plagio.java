public class ConvertirACaracteresMinimos {
    public static void main(String[] args) {
        String frase = "JAVA Es Genial";
        StringBuilder sb = new StringBuilder();
        for (char c : frase.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c + 32)); // Convertir a minúscula ASCII
            } else {
                sb.append(c);
            }
        }
        System.out.println("En letras pequeñas: " + sb.toString());
    }
}