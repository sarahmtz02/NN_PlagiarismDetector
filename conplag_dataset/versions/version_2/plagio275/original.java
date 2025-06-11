public class MetodoPublicoConParametro {
    public void procesar(String entrada) {
        System.out.println("Procesando: " + entrada);
    }

    public static void main(String[] args) {
        MetodoPublicoConParametro obj = new MetodoPublicoConParametro();
        obj.procesar("Dato de entrada");
    }
}