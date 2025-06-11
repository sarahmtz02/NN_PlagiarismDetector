public class LecturaDeAtributo {
    public String texto = "Hola desde el campo.";

    public String obtenerTexto() {
        return this.texto;
    }

    public static void main(String[] args) {
        LecturaDeAtributo instancia = new LecturaDeAtributo();
        System.out.println(instancia.obtenerTexto());
    }
}