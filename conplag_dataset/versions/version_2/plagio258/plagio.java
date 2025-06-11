public class CompararTextoSinDistinguirCaso {
    public static void main(String[] args) {
        String textoA = "Manzana";
        String textoB = "manzana";
        if (textoA.toLowerCase().equals(textoB.toLowerCase())) {
            System.out.println("Los textos son idénticos en su contenido, sin importar el caso.");
        } else {
            System.out.println("Los textos difieren.");
        }
    }
}