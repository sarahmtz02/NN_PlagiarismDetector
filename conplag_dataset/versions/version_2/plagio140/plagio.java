public class EsNumeroPar {
    public static void main(String[] args) {
        int valor = 4;
        String tipoNumero = (valor % 2 == 0) ? "par" : "impar";
        System.out.println(valor + " es " + tipoNumero + ".");
    }
}