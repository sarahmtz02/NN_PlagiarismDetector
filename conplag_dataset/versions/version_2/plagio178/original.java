public class ClaseInternaEstatica {
    public static class AnidadaEstatica {
        public void mostrarMensaje() {
            System.out.println("Desde la clase anidada estática.");
        }
    }

    public static void main(String[] args) {
        AnidadaEstatica obj = new AnidadaEstatica();
        obj.mostrarMensaje();
    }
}