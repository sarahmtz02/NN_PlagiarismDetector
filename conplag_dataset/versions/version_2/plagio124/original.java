public class MetodoConSobrecarga {
    public static void imprimir(String texto) {
        System.out.println("Cadena: " + texto);
    }

    public static void imprimir(int numero) {
        System.out.println("Número: " + numero);
    }

    public static void main(String[] args) {
        imprimir("Hola");
        imprimir(123);
    }
}