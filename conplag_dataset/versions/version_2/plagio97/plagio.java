public class IgualdadDeTextos {
    public static void main(String[] args) {
        String textoA = "hola";
        String textoB = "Hola";
        if (textoA.toLowerCase().equals(textoB.toLowerCase())) {
            System.out.println("Ambos textos coinciden (sin importar mayúsculas/minúsculas).");
        } else {
            System.out.println("Los textos no son idénticos.");
        }
    }
}