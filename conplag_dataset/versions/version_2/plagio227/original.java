public class ClaseAnidadaNoEstatica {
    private String mensajeExterior = "Mensaje desde la clase exterior.";

    public class AnidadaNoEstatica {
        public void imprimirMensaje() {
            System.out.println(mensajeExterior + " Desde la clase anidada no estática.");
        }
    }

    public static void main(String[] args) {
        ClaseAnidadaNoEstatica exterior = new ClaseAnidadaNoEstatica();
        ClaseAnidadaNoEstatica.AnidadaNoEstatica anidada = exterior.new AnidadaNoEstatica();
        anidada.imprimirMensaje();
    }
}