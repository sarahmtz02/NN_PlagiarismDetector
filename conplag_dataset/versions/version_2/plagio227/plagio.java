public class ContenedorDeInnerClass {
    private String textoPrincipal = "Contenido de la clase principal.";

    class InnerClass {
        public void mostrarContenido() {
            System.out.println(textoPrincipal + " Y desde la clase interna.");
        }
    }

    public static void main(String[] args) {
        ContenedorDeInnerClass contenedor = new ContenedorDeInnerClass();
        InnerClass interna = contenedor.new InnerClass();
        interna.mostrarContenido();
    }
}