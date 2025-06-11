public class ContarCaracteres {
    public static void main(String[] args) {
        String texto = "Un texto";
        int contador = 0;
        for (char c : texto.toCharArray()) {
            contador++;
        }
        System.out.println("Número de caracteres: " + contador);
    }
}