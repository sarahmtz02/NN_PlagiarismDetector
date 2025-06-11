public class PropiedadInmutable {
    private final String IDENTIFICADOR = "alpha-1";

    public String obtenerIdentificador() {
        return IDENTIFICADOR;
    }

    public static void main(String[] args) {
        PropiedadInmutable instancia = new PropiedadInmutable();
        System.out.println("Identificador: " + instancia.obtenerIdentificador());
    }
}