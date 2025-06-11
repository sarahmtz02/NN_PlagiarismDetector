public class ChequearParidad {
    public static void main(String[] args) {
        int valor = 7;
        String tipo = (valor % 2 == 0) ? "par" : "impar";
        System.out.println("El valor es " + tipo + ".");
    }
}