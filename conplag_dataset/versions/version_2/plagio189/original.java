public class FuncionConParametroDefault {
    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }

    public static void imprimirConDefault() {
        imprimir("Mensaje por defecto.");
    }

    public static void main(String[] args) {
        imprimirConDefault();
        imprimir("Otro mensaje.");
    }
}