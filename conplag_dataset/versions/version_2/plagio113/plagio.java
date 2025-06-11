public class AccesoControlado {
    private String contenidoOculto = "Contenido restringido";

    private String recuperarContenido() {
        return contenidoOculto;
    }

    public void mostrarContenido() {
        System.out.println("Acceso al contenido: " + recuperarContenido());
    }

    public static void main(String[] args) {
        AccesoControlado instancia = new AccesoControlado();
        instancia.mostrarContenido();
    }
}