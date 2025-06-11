public class CompararTexto {
    public static void main(String[] args) {
        String textoA = "pera";
        String textoB = new String("pera");
        if (textoA.contentEquals(textoB)) {
            System.out.println("El contenido de los textos es idéntico.");
        } else {
            System.out.println("El contenido de los textos es distinto.");
        }
    }
}