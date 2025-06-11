public class DatosBaseObjeto {
    String etiqueta;
    int valor;

    public DatosBaseObjeto() {
        etiqueta = "N/A";
        valor = -1;
    }

    public void verDetalles() {
        System.out.println("Etiqueta: " + etiqueta + ", Valor: " + valor);
    }

    public static void main(String[] args) {
        DatosBaseObjeto instancia = new DatosBaseObjeto();
        instancia.verDetalles();
    }
}