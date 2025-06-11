public class ReferenciaDeTextos {
    public static void main(String[] args) {
        String textoA = new String("Java");
        String textoB = "Java";
        if (textoA == textoB) {
            System.out.println("Las referencias de texto son idénticas.");
        } else {
            System.out.println("Las referencias de texto son distintas.");
        }
    }
}