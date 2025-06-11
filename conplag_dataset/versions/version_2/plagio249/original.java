public class MetodoConMultipleSobreCarga {
    public static void imprimir(String texto) {
        System.out.println("String: " + texto);
    }

    public static void imprimir(int numero) {
        System.out.println("Int: " + numero);
    }

    public static void main(String[] args) {
        imprimir("Hola");
        imprimir(123);
    }
}