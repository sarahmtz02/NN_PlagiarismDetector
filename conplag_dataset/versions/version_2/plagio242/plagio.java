public class ConvertirACaracteresMaximos {
    public static void main(String[] args) {
        String frase = "java es genial";
        StringBuilder sb = new StringBuilder();
        for (char c : frase.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append((char) (c - 32)); // Convertir a mayúscula ASCII
            } else {
                sb.append(c);
            }
        }
        System.out.println("En letras grandes: " + sb.toString());
    }
}