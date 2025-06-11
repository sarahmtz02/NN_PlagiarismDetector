public class RevertirTexto {
    public static void main(String[] args) {
        String fuente = "Hola";
        String resultado = "";
        for (int i = fuente.length() - 1; i >= 0; i--) {
            resultado += fuente.charAt(i);
        }
        System.out.println("Texto revertido: " + resultado);
    }
}