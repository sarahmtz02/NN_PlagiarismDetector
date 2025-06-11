public class ClaseConMetodosPrivadosYPublicos {
    private String datoSecreto = "Información confidencial";

    private String obtenerDato() {
        return datoSecreto;
    }

    public void imprimirDatoPublicamente() {
        System.out.println("Dato público: " + obtenerDato());
    }

    public static void main(String[] args) {
        ClaseConMetodosPrivadosYPublicos obj = new ClaseConMetodosPrivadosYPublicos();
        obj.imprimirDatoPublicamente();
    }
}