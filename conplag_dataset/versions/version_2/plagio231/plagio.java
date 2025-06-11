public class CadenaAFlotante {
    public static void main(String[] args) {
        String textoNumerico = "123.45";
        double numeroFlotante = Double.valueOf(textoNumerico).doubleValue();
        System.out.println("Texto a número con decimales: " + numeroFlotante);
    }
}